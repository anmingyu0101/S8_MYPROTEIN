package CartProduct;

import static Jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


public class CartProductService {
	private CartProductDao dao = new CartProductDao();
	
	public int insert(CartProductVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	public int update(CartProductVo vo, int member_no, int product_no) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, member_no, product_no);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	public int delete(int member_no, int product_no) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, member_no ,product_no);
		if(result > 0) commit(conn);
		else rollback(conn);
		return result;
		
	}
	public List<CartProductVo> selectList(Connection conn){
		List<CartProductVo> volist = null;

		return volist;
}
	public CartProductVo selectOne(Connection conn, int member_no, int product_no, int price) {
		CartProductVo vo = null;
		
		String query = "";
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


