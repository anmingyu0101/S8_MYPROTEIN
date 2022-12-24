package CartProduct;

import java.sql.*;
import java.util.List;

public class CartProductDao {

		public int insert(Connection conn, CartProductVo vo) {
			int result = 0;
			return result;
		}
		public int update(Connection conn, CartProductVo vo, int member_no, int product_no) {
			int result = 0;
			return result;
		}
		public int delete(Connection conn,int member_no, int product_no) {
			int result = 0;
			return result;
		}
		public List<CartProductVo> selectList(Connection conn){
			List<CartProductVo> volist = null;
			return volist;
			
		}
		public CartProductVo selectOne(Connection conn) {
			CartProductVo vo = null;
			return vo;
		}
		public CartProductVo CartProduct(Connection conn) {
			CartProductVo vo = null;
			
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
