package OrderDetail;

import static Jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import CartProduct.CartProductVo;



public class OrderDetailService {
	private OrderDetailDao dao = new OrderDetailDao();
	
	public int insert(OrderDetailVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int update(OrderDetailVo vo, int member_no, int product_no) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, member_no, product_no);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(Connection conn, int member_no, int product_no) {
		int result = 0;
		return result;
	}
	public List<OrderDetailVo> selectList(Connection conn){
		List<OrderDetailVo> volist = null;
		return volist;
		
	}
	public OrderDetailVo selectOne(Connection conn) {
		OrderDetailVo vo = null;
		return vo;
	}
	public OrderDetailVo OrderDetail(Connection conn) {
		OrderDetailVo vo = null;
		
		String query ="";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(query);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return vo;
	}
}
