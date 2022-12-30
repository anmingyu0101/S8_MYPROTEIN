package kh.s8.protein.member.model;

import java.sql.*;
import java.util.*;

import kh.s8.protein.common.jdbc.JdbcTemplate;

public class MemberDao {


	public int insert(Connection conn, MemberVo vo) {
		int result = 0;
//		MEMBER_NO	NUMBER	NOT NULL,
//		ID	VARCHAR2(20)	NOT NULL,
//		PW	VARCHAR2(20)	NOT NULL,
//		NAME	VARCHAR2(20)	NOT NULL,
//		EMAIL	VARCHAR2(40)	NOT NULL,
//		PHONE	VARCHAR2(20)	NULL
		String sql = "insert into member (MEMBER_NO, 					ID, PW, NAME, EMAIL, PHONE) ";
		sql += " values ((select nvl(max(member_no), 0)+1 from Member), ?, ?, ?, ?, ? )";
		
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getPw());
			pstmt.setString(3, vo.getName());
			pstmt.setString(4, vo.getEmail());
			pstmt.setString(5, vo.getPhone());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(pstmt);
		}
		
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
	
	public MemberVo login(Connection conn, String id, String pw){
		MemberVo vo = null;
		
		String query = "select id, name from member where email=? and pw=?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			
			rs = pstmt.executeQuery();
			if(rs.next()) {
				vo = new MemberVo();
				vo.setId(rs.getString("id"));
//				vo.setName(rs.getString("Name"));
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

