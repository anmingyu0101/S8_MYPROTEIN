package member.model.vo;

import static common.filter.JdbcTemplate.*;

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
	public int update(MemberVo vo, String id) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, id);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(String id) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, id);
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
	public MemberVo selectOne(String id){
		MemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, id);
		close(conn);
		return vo;
	}
	public MemberVo login(String id, String pw, String name, String email, String phone){
		MemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.login(conn, id, pw, name, email, phone );
		close(conn);
		return vo;
	}

}
