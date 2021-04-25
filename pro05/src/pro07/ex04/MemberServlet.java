package pro07.ex04;

import java.io.*;
import java.sql.*;
import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

 @WebServlet("/member3") 
public class MemberServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	 					throws ServletException, IOException {
		doHandle(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
						throws ServletException, IOException {
		doHandle(req, resp);
	}
	private void doHandle(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException
	{
		 req.setCharacterEncoding("utf-8");
	     resp.setContentType("text/html;charset=utf-8");
	     MemberDAO dao=new MemberDAO();
	     PrintWriter out=resp.getWriter();
	     String command=req.getParameter("command");
		
		if(command != null && command.equals("addMember")) {
			String _id = req.getParameter("id"); 
			String _pw = req.getParameter("pw"); 
			String _name = req.getParameter("name"); 
			String _mail = req.getParameter("mail");
			MemberVO vo = new MemberVO();
			vo.setId(_id);
			vo.setPw(_pw);
			vo.setName(_name);
			vo.setMail(_mail);
			dao.addMember(vo);
		} else if (command != null && command.equals("delMember")) {
			String id = req.getParameter("id");
			dao.delMember(id);
		}
		
		List<MemberVO> list = dao.listMembers();
		
		
		out.print("<html><body>");
		out.print("<table border=1><tr align='center' bgcolor='lightgreen'>");
		out.print("<td>아이디</td><td>비밀번호</td><td>이름</td><td>이메일</td><td>가입일</td><td >삭제</td></tr>");
		
		for(int i = 0; i < list.size(); i++) {
			MemberVO memberVO = list.get(i);
			String id = memberVO.getId();
			String pw = memberVO.getPw();
			String name = memberVO.getName();
			String mail = memberVO.getMail();
			Date joindate = memberVO.getJoinDate();
			out.print("<tr><td>" + id + "</td><td>" + pw + "</td><td>" + name + "</td><td>" + mail + "</td><td>" + joindate + "</td><tr>" +
							"<a href='/pro05/member3?command=delMember&id=" + id + "'>삭제</a></td></tr>");
		}
		out.print("</table></body></html>");
		out.print("<a href='/pro05/memberFrom.html'>새 회원 등록하기 </a> ");
	}
}
