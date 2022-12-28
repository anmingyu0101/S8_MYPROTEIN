package kh.s8.protein.product.image.model;

import java.sql.*;
import java.util.List;

public class ProductImageDao {
	
	public int insert(Connection conn, ProductImageVo vo) {
		int result = 0;
		return result;
	}
	public int update(Connection conn, ProductImageVo vo, String product_img) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, String product_img) {
		int result = 0;
		return result;
	}
	public List<ProductImageVo> selectList(Connection conn){
		List<ProductImageVo> volist = null;
		
		return volist;
	}
	
	public ProductImageVo selectOne(Connection conn, String product_img) {
		ProductImageVo vo = null;
		return vo;
		
	}
	
	public ProductImageVo Product(Connection conn, String product_img, int product_no, int count) {
		ProductImageVo vo = null;
		
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
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return vo;
	}
}
