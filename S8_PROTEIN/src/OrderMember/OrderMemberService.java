package OrderMember;

import static Jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;

import member.model.vo.MemberVo;



public class OrderMemberService {
	private OrderMemberDao dao = new OrderMemberDao();
	
	public int insert(OrderMemberVo vo) {
		int result= 0;
		Connection conn = getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int update(OrderMemberVo vo, int order_no) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, order_no);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
		
	}
	public int delete(int order_no) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, order_no);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);	
		return result;
	}
	public List<OrderMemberVo> selectList(){
		List<OrderMemberVo> volist = null;
		Connection conn = getConnection();
		volist = dao.selectList(conn);
		close(conn);
		return volist;
	}
	public OrderMemberVo selectOne(int order_no){
		OrderMemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, order_no );
		close(conn);
		return vo;
	}
	public OrderMemberVo Order(int order_no, int member_no, int order_date, String PostalCode, String address, int payment_total, String method_pay, int total_pay){
		OrderMemberVo vo = null;
		Connection conn = getConnection();
		vo = dao.Order(conn, order_no, member_no, order_date, PostalCode, address, payment_total, method_pay, total_pay);
		close(conn);
		return vo;
	}
}
