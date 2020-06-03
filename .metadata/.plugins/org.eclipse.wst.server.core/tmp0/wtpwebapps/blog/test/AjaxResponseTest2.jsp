<%@page import="com.sun.istack.internal.Builder"%>
<%@page import="java.io.BufferedReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BufferedReader br =	request.getReader();

	String input = null;
	StringBuilder sb = new StringBuilder();
	while((input = br.readLine()) != null){
		sb.append(input);
	}
	System.out.println("받은 데이터 시작 --------------------");
	System.out.println(sb.toString());
	System.out.println("받은 데이터 끝 --------------------");
%>