package sec02.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	public void init() throws ServletException{
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
						throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
	}
}
