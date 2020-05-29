package ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/choiceDog")
public class ChoiceDogServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 

    public ChoiceDogServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset = euc-kr");
		PrintWriter out = response.getWriter();
		String[] dog = request.getParameterValues("dog");
		out.print("<html>");
		out.print("<head");
		out.print("</head>");
		out.print("<body bgcolor = 'black'>");
		out.print("<table align = 'center' bgcolor = 'yellow'>");
		out.print("<tr>");
		for (int i = 0; i < dog.length; i++) {
			out.print("<td>");
			out.print("<imgsrc='"+dog[i]+"'/>");
			out.print("</td>");
		}
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

}
