package pro08.ex02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// @WebServlet("/secondservlet")
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("refresh�� �̿��� redirect �ǽ��Դϴ�.");
		out.println("</body></html>");
	}
}
