<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//request.setCharacterEncoding("UTF-8");  //한글깨지면 주석제거
	//request.setCharacterEncoding("EUC-KR");  //해당시스템의 인코딩타입이 EUC-KR일경우에
	String inputYn = request.getParameter("inputYn"); 
	String roadFullAddr = request.getParameter("roadFullAddr");
%>

<%@ include file = "../include/nav.jsp" %> <!--  상대경로.. -->


<div class = container>
<form action="user?cmd=joinProc" method = "post" class="was-validated" name="form" onsubmit = "return validate()"> <!-- return이 트루이면  -->
  
  <div class="form-group">
    <label for="username">Username:</label>
    <button type = "button" class = "btn btn-warning float-right" onclick = "usernameCheck()"> 중복 확인 </button>
    <input type="text" class="form-control" id="username" placeholder="Enter username" name="username" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
 
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="password" class="form-control" id="password" placeholder="Enter password" name="password" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  
  <div class="form-group">
    <label for="email">Email:</label>
    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email" required>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
 
  
  <div class="form-group">
    <label for="address">Address:</label>
    <button type = "button" class = "btn btn-warning float-right" onclick = "goPopup();"> 주소 검색 </button>
    <!-- type을 button으로 안하면 submit을 안함.
    	 인라인 블록이면  float-right,left 으로 위치를 정렬한다.
    	 아니면 저스티스컨텐트 로 한다.-->
    <input type="text" class="form-control" id="address" placeholder="Enter address" name="address" required readonly>
    <div class="valid-feedback">Valid.</div>
    <div class="invalid-feedback">Please fill out this field.</div>
  </div>
  
  <button type = "submit" class="btn btn-primary">Submit</button>
</form>
</div>

 <script src="/blog/js/join.js"></script>
<%@ include file = "../include/footer.jsp" %> <!--  상대경로.. -->