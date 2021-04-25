package sec03.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/login3")
public class LoginServlet3 extends HttpServlet{
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}
	
	protected void doPost(HttpServletRequest rq, HttpServletResponse resp)
						throws ServletException, IOException {
		rq.setCharacterEncoding("UTF-8");
		String user_id = rq.getParameter("user_id");
		String user_pw = rq.getParameter("user_pw");
		System.out.println("아이디:" + user_id);
		System.out.println("비밀번호:" + user_pw);
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
