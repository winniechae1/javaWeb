package pro08.ex04;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/secondservlet")
public class SecondServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String name = req.getParameter("name");
		out.println("<html><body>");
		out.println("�̸�:" + name);
		out.println("<br>");
		out.println("dispatch�� �̿��� redirect �ǽ��Դϴ�.");
		out.println("</body></html>");
	}
}
