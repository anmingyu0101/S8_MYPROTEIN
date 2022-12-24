package Product;

import java.sql.*;
import java.util.List;



public class ProductDao {

		public int insert(Connection conn, ProductVo vo) {
			int result = 0;
			return result;
		}
		
		public int update(Connection conn, ProductVo vo, int product_no) {
			int result = 0;
			return result;
			
		}
		public int delete(Connection conn, int product_no) {
			int result = 0;
			return result;
			
		}
		public List<ProductVo> selectList(Connection conn){
			List<ProductVo> volist = null;

			return volist;
}
		public ProductVo selectOne(Connection conn, int product_no) {
			ProductVo vo = null;
			return vo;
		}
		public ProductVo Cart(Connection conn, int product_no, String product_name, String product_price ,String product_desc){	
			ProductVo vo = null;
			
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