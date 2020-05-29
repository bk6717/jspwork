package ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/memReg")
public class MemRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public MemRegServlet() {
        super();
    }
    //요청이 post 방식이므로 doPost 메서드 구현
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=euc-kr");
		PrintWriter out = response.getWriter();
		String name =request.getParameter("name");
		String addr =request.getParameter("addr");
		String tel =request.getParameter("tel");
		String hobby =request.getParameter("hobby");
		
		out.print("이름  = "+name+ "<br>");
		out.print("주소  = "+addr+ "<br>");
		out.print("번호  = "+tel+ "<br>");
		out.print("취미  = "+hobby+ "<br>");
		
	}

}
