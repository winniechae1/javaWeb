package sec04.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/loginTest2")
public class LoginTest2 extends HttpServlet {
	public void init() {
		System.out.println("init �޼��� ȣ��");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		
		System.out.println("���̵� :" + id);
		System.out.println("��й�ȣ :" + pw);
		if(id!=null && (id.length()!=0)) {
			if(id.equals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<font size='12'>�����ڷ� �α��� �ϼ̽��ϴ�!! </font>");
				out.print("<br>");
				out.print("<input type=button value='ȸ������ �����ϱ�' />");
				out.print("<input type=button value='ȸ������ �����ϱ�' />");
				out.print("</body>");
				out.print("</html>");
			} else {
				out.print("<html>");
				out.print("<body>");
				out.print(id + " ��!! �α��� �ϼ̽��ϴ�.");
				out.print("</body>");
				out.print("</html>");
			}
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("ID �� PW�� �Է��ϼ���");
			out.print("<br>");
			out.print("<a href='http://localhost/pro05/test01/login.html'>�α��� â���� �̵� </a>");
			out.print("</body>");
			out.print("</html>");
		}
	}
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��");
	}
}
