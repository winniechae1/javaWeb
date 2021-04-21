package sec01.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/input")
public class InputServlet extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String user_id = req.getParameter("user_id");
		String user_pw = req.getParameter("user_pw");
		System.out.println("아이디:" + user_id);
		System.out.println("비밀번호:" + user_pw);
		String[] subject = req.getParameterValues("subject");
		for(String str : subject) {
			System.out.println("선택한 과목:" + str);
		}
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
