<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@include file = "../include/nav.jsp" %>
<%@ include file="../include/authentication.jsp"%>
    <meta charset="UTF-8">
    <title>Summernote with Bootstrap 4</title>
	
   
    <script src="https://cdn.jsdelivr.net/npm/summernote@0.8.18/dist/summernote-bs4.min.js"></script>
    
	<form action="/blog/board?cmd=writeProc" method="POST">
	
	<div class="form-group">
		<label for="title">Title:</label>
		<input type="text" class="form-control" placeholder="title" id="title" name="title">
	</div>
	
    <div class="form-group">
		<label for="content">Content:</label>
		<textarea class="form-control" rows="5" id="content" name="content"></textarea>  <!-- textarea는 태그 사이에 넣는다. -->
	</div>
    
    <script>
      $('#content').summernote({
        placeholder: 'Hello',
        tabsize: 2,
        height: 100
      });
    </script>
  
    <button type="submit" class="btn btn-primary">글쓰기</button>
    
   
    </form>
    
<%@include file = "../include/footer.jsp" %>