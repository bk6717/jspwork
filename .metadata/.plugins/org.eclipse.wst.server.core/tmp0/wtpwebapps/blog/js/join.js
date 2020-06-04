var isCheckedUsername = false; 

//const goPopup = () => {    변수 안에 함수를 집어넣는다 (요즘 방식)
//	window.open("/blog/juso/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
//}


//juso.go.kr 라이브러리 함수 (시작) -----------------------------------
function goPopup(){
	 window.open("/blog/juso/jusoPopup.jsp","pop","width=570,height=420, scrollbars=yes, resizable=yes"); 
}


function jusoCallBack(roadFullAddr){
	//document.form.roadFullAddr.value = roadFullAddr;
	// ^       ^       ^           ^  
	//내문서       이름                              리턴값
	var tfAddress = document.querySelector("#address");
	tfAddress.value = roadFullAddr; 
}


function init(){
	var url = location.href;
	var confmKey = "devU01TX0FVVEgyMDIwMDYwMjA5NDkwMjEwOTgyMDE=";
	var resultType = "4"; // 도로명주소 검색결과 화면 출력내용, 1 : 도로명, 2 : 도로명+지번, 3 : 도로명+상세건물명, 4 : 도로명+지번+상세건물명 
	var inputYn= "<%=inputYn%>";
	if(inputYn != "Y"){
		document.form.confmKey.value = confmKey;
		document.form.returnUrl.value = url;
		document.form.resultType.value = resultType;
		document.form.action="http://www.juso.go.kr/addrlink/addrLinkUrl.do"; //인터넷망
		//document.form.action="http://www.juso.go.kr/addrlink/addrMobileLinkUrl.do"; //모바일 웹인 경우, 인터넷망
		document.form.submit();
		
	}else{
		opener.jusoCallBack("<%=roadFullAddr%>");
		window.close();
		}
}

//juso.go.kr 함수 (끝)



//중복체크 함수
function validate(){
	if(!isCheckedUsername){
		alert('username 중복체크를 해주세요')
		}return isCheckedUsername;
}


// 데이터베이스에 ajax 요청을 해서 중복 유저네임이 있는지 확인하고
// 있으면 1 리턴 ,없으면 0리턴, 오류시 -1 리턴
function usernameCheck(){
	//성공
	var tfUsername = $('#username').val();
	//alert(tfUsername);
	console.log(tfUsername);
	$.ajax({
		type: 'get',
		url: `/blog/user?cmd=usernameCheck&username=${tfUsername}`,
		
	}).done(function(result){
		console.log(result);
		if(result == 1){// 2개는 값만비교하고 3개는 타입만 비교한다.
			alert('아이디가 중복되었습니다.');	
		}else if(result == 0){
			alert('사용하실 수 있는 아이디입니다.');
			isCheckedUsername = this;	
		}else{
			console.log('develop : 서버 오류');
		}
	}).fail(function(error){
		console.log(error);
	});
	isCheckedUsername = true;
}