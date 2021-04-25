package sec03.ex02;

import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/login4")
public class LoginServlet4 extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
					throws ServletException, IOException {
		System.out.println("doGet �޼��� ȣ��");
		doHandle(req, resp);
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
		System.out.println("doPost �޼��� ȣ��");
		doHandle(req, resp);
	}
	
	private void doHandle(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String user_id = req.getParameter("user_id");
		System.out.println("doHandle �޼��� ȣ��");
		String user_pw = req.getParameter("user_pw");
		System.out.println("���̵�:" + user_id);
		System.out.println("��й�ȣ:" + user_pw);
	}
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
