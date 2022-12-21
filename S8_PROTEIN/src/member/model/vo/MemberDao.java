package member.model.vo;

import java.sql.*;
import java.util.*;

import common.filter.JdbcTemplate;

public class MemberDao {


	public int insert(Connection conn, MemberVo vo) {
		int result = 0;
		return result;
		
	}
	public int update(Connection conn, MemberVo vo, String id) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, String id) {
		int result = 0;
		return result;
	}
	public List<MemberVo> selectList(Connection conn){
		List<MemberVo> volist = null;

		return volist;
	}
	public MemberVo selectOne(Connection conn, String id) {
		MemberVo vo = null;
		return vo;
	}
	
	public MemberVo login(Connection conn, String id, String pw, String name, String email, String phone){
		MemberVo vo = null;
		
		String query = "select id, name from member where id=? and pw=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			pstmt.setString(3, name);
			pstmt.setString(4, email);
			pstmt.setString(5, phone);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVo();
				vo.setId(rs.getString(id));
//				vo.setName(rs.getString(Name));
			}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				JdbcTemplate.close(rs);
				JdbcTemplate.close(pstmt);
			}
		
		return vo;
		
		
	
	
}
	
}

