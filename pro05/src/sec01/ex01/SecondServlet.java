package sec01.ex01;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

public class SecondServlet extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
		System.out.println("init �޼��� ȣ��>>>>");
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
					throws ServletException, IOException {
		System.out.println("doGet �޼��� ȣ��>>>>");
	}
	
	@Override 
	public void destroy() {
		System.out.println("destroy �޼��� ȣ��>>>>");
	}
}
