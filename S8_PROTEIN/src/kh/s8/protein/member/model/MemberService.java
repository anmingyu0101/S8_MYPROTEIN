package kh.s8.protein.member.model;

import static kh.s8.protein.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;

public class MemberService {
	private MemberDao dao = new MemberDao();
	
	public int insert(MemberVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
		
	}
	public int update(MemberVo vo, String email) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, email);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(String email) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, email);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);	
		return result;
	}
	public List<MemberVo> selectList(){
		List<MemberVo> volist = null;
		Connection conn = getConnection();
		volist = dao.selectList(conn);
		close(conn);
		return volist;
	}
	public MemberVo selectOne(String email){
		MemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, email);
		close(conn);
		return vo;
	}
	public MemberVo login(String email, String pw){
		MemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.login(conn, email, pw );
		close(conn);
		return vo;
	}

}
