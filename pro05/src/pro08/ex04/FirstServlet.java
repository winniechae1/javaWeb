package pro08.ex04;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/firstservlet")
public class FirstServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
						throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
//		RequestDispatcher dispatch = req.getRequestDispatcher("secondservlet");
		RequestDispatcher dispatch = req.getRequestDispatcher("secondservlet?name=lee");
		dispatch.forward(req, resp);
	}
}
