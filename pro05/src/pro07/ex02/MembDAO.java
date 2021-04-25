package pro07.ex02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
import java.sql.Date;


public class MembDAO {
	private static final String driver = "oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String user = "hello";
	private static final String pw = "increpas";
	private PreparedStatement pstmt;
	private Connection con;
	
	public List<MembVO> listMembers(){
		List<MembVO> list = new ArrayList<MembVO>();
		try {
			connDB();
			String query = "select * from member ";
			System.out.println("prepareStatement: " + query);
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				String mail = rs.getString("mail");
				Date joinDate = rs.getDate("joindate");
				MembVO vo = new MembVO();
				vo.setId(id);
				vo.setPw(pw);
				vo.setName(name);
				vo.setMail(mail);
				vo.setJoinDate(joinDate);
				list.add(vo);
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		} return list;
	}
	private void connDB() {
		try {
			Class.forName(driver);
			System.out.println("Oracle 드라이버 로딩 성공");
			con = DriverManager.getConnection(url, user, pw);
			System.out.println("Connection 생성 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
