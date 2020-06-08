<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../include/nav.jsp"%>


<div class="container">
	<!-- <a class = "btn btn-secondaty" href ="javascript:hisory.back()">뒤로가가</a>-->
	<button class="btn btn-light" onclick="history.back()">뒤로가기</button>
	
<!--글을 쓴사람만 보이게 -->	
<c:if test="${sessionScope.principal.id == dto.board.userId}">

	<a href = "/blog/board?cmd=update&id=${dto.board.id}" class="btn btn-warning">수정</a>
	<button class="btn btn-danger" onClick ="deleteById(${dto.board.id})">삭제</button>
	
</c:if>

<br/><br/>
<h6>작성자 :<i>${dto.username}</i></h6>
<br/>
	<h2><b>${dto.board.title}</b></h2>
	
	<div class="form-group">
		<div class="container p-3 my-3 border">${dto.board.content}</div>
	</div>
</div>

<script>
function deleteById(boardId){
	$.ajax({
		type : "POST",
		url : "/blog/board?cmd=delete&id="+boardId,
		dataType : "text"
	}).done(function(result){
		console.log(result);
		if(result == 1){
			alert("삭제성공");
			location.href = "/blog/index.jsp";
		}else{
			alert("삭제실패");
		}
	}).fail(function(error){
		console.log(error);
		console.log(error.responseText);
		console.log(error.status);
		alert("서버오류");
		})
}
</script>
<%@ include file="../include/footer.jsp"%>
