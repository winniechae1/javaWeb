package sec01.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/input")
public class InputServlet extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init �޼��� ȣ��");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		String user_id = req.getParameter("user_id");
		String user_pw = req.getParameter("user_pw");
		System.out.println("���̵�:" + user_id);
		System.out.println("��й�ȣ:" + user_pw);
		String[] subject = req.getParameterValues("subject");
		for(String str : subject) {
			System.out.println("������ ����:" + str);
		}
	}
	
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
