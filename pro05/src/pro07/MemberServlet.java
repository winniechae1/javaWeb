package pro07;

import java.io.*;
import java.sql.Date;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/member") 
public class MemberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	 					throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		MemberDAO dao = new MemberDAO();
		List<MemberVO> list = dao.listMembers();
		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>���̵�</td><td>��й�ȣ</td><td>�̸�</td><td>�̸���</td><td>������</td></tr>");
		
		for(int i = 0; i < list.size(); i++) {
			MemberVO memberVO = list.get(i);
			String id = memberVO.getId();
			String pw = memberVO.getPw();
			String name = memberVO.getName();
			String mail = memberVO.getMail();
			Date joindate = memberVO.getJoinDate();
			out.print("<tr><td>" + id + "</td><td>" + pw + "</td><td>" + name + "</td><td>" + mail + "</td><td>" + joindate + "</td><tr>");
		}
		out.print("</table></body></html>");
	}
}
