package sec04.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/loginTest2")
public class LoginTest2 extends HttpServlet {
	public void init() {
		System.out.println("init 메서드 호출");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		String id = req.getParameter("user_id");
		String pw = req.getParameter("user_pw");
		
		System.out.println("아이디 :" + id);
		System.out.println("비밀번호 :" + pw);
		if(id!=null && (id.length()!=0)) {
			if(id.equals("admin")) {
				out.print("<html>");
				out.print("<body>");
				out.print("<font size='12'>관리자로 로그인 하셨습니다!! </font>");
				out.print("<br>");
				out.print("<input type=button value='회원정보 수정하기' />");
				out.print("<input type=button value='회원정보 삭제하기' />");
				out.print("</body>");
				out.print("</html>");
			} else {
				out.print("<html>");
				out.print("<body>");
				out.print(id + " 님!! 로그인 하셨습니다.");
				out.print("</body>");
				out.print("</html>");
			}
		} else {
			out.print("<html>");
			out.print("<body>");
			out.print("ID 와 PW를 입력하세요");
			out.print("<br>");
			out.print("<a href='http://localhost/pro05/test01/login.html'>로그인 창으로 이동 </a>");
			out.print("</body>");
			out.print("</html>");
		}
	}
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
