package sec03.ex03;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/login5")
public class LoginServlet5 extends HttpServlet {
	public void init() {
		System.out.println("init 메서드 호출");
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String sid = req.getParameter("user_id");
		String spw = req.getParameter("user_pw");
		String address = req.getParameter("user_address");
		System.out.println("아이디 :" + sid);
		System.out.println("비밀번호 :" + spw);
		
		String data = "<html>";
		data += "<body>";
		data += "아이디 : " + sid;
		data += "<br>";
		data += "비밀번호: " + spw;
		data += "<br>";
		data += "주소 : " + address;
		data += "</body>";
		data += "</html>";
		out.print(data);
	}
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
	
}
