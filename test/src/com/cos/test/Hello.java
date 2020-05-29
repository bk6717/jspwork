package com.cos.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
@WebServlet("/hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Hello() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	//서블릿
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = "cos";
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>");
		out.print("aaaaaa");
		out.print("<br>");
		out.print("<table border = \"1\" >");
		out.print("<tr>");
		out.print("<td>apple</td>");
		out.print("<td>apple</td>");
		out.print("<td>apple</td>");
		out.print("<td>apple</td>");
		out.print("</tr>");
		out.print("<tr>");
		out.print("<td>banana</td>");
		out.print("<td>banana</td>");
		out.print("<td>banana</td>");
		out.print("<td>banana</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</h1>");
		out.print("</body>");  
		out.print("</html>");
	}// get 요청하면 함수 자동실행

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("request post");
	}// post 요청하면 함수 자동실행

}
