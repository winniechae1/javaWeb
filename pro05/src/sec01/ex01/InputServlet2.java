package sec01.ex01;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/input2")
public class InputServlet2 extends HttpServlet {
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		Enumeration enu = req.getParameterNames();
		while(enu.hasMoreElements()) {
			String name = (String) enu.nextElement();
			String[] values = req.getParameterValues(name);
			for (String value : values) {
				System.out.println("name=" + name + ",value=" + value);
			}
		}
	}
	
	public void destroy() {
		System.out.println("destroy 메서드 호출");
	}
}
