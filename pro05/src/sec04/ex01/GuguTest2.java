package sec04.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/guguTest2")
public class GuguTest2 extends HttpServlet {
	public void init() {
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
						throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		int dan = Integer.parseInt(req.getParameter("dan"));
		out.print(" <table border=1 width=800 align=center");
		out.print("<tr align=center bgcolor='#FFFF66'>");
		out.print("<td colspan=2>" + dan + " 단 출력 </td>");
		out.print("</tr>");
		
		for(int i = 1; i < 10; i++) {
			if( i % 2 == 0) {
				out.print("<tr align=center bgcolor='#ACFA58'> ");
			} else {
				out.print("<tr align=center bgcolor='#81BEF7'> ");
			}
			out.print("<td width=400>");
			out.print(dan + " * " + i);
			out.print("</td>");
			out.print("<td width=400>");
			out.print(i * dan);
			out.print("</td>");
			out.print("</tr>");
			
		}
		out.print("</table>");
	}
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
