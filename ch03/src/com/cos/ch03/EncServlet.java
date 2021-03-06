package com.cos.ch03;

import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * 한글테스트
 * 데이터 전달
 * 데이터 응답
 */

//http:
@WebServlet("/postman")
public class EncServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public EncServlet() {super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get 요청옴");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("put 요청옴");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		
		User user = new User();
		user.setUsername(username);
		user.setPassward(password);
		user.setEmail(email);
		
		System.out.println(user.getUsername());
		System.out.println(user.getPassward());
		System.out.println(user.getEmail());
	
	}
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("post 요청옴");
		//request.setCharacterEncoding("UTF-8");
		//String username = request.getParameter("username");
		//System.out.println("post 받은값 : " + username);
		BufferedReader br = req.getReader();  //bufferdreader 와 똑같음
		String data = null;
		StringBuilder sb = new StringBuilder();
		while((data=br.readLine()) !=null) {
			System.out.println(data);
			sb.append(data);
		}
		Gson gson = new Gson();
		User user = gson.fromJson(sb.toString(),User.class);
		//db에 인서트하면 끝 
		System.out.println(user.getUsername());
		System.out.println(user.getPassward());
		System.out.println(user.getEmail());
		
		
	}
	@Override
		protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete 요청옴");
	}
}
