package com.cos.ch03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//id 와 passwd 라는 이름의 파라미터 값을 받는다
		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		// 타입이 html 이고,setContentType으로 지정해주는 마임 타입에 따라 응답하는 데이터타입이 결정
		response.setContentType("text/html;charset= euc-kr");
		//response 객체에 내용을 출력할 수 있는 축력스트림 생성
		PrintWriter out = response.getWriter();
		//id 변수값과 passwd 변수값 출력
		out.println("아이디 = "+ id +"<br>");
		out.println("비밀번호 = "+ passwd +"<br>");
	}

}
