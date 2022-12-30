package kh.s8.protein.cart.product.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import kh.s8.protein.common.jdbc.JdbcTemplate;

public class CartProductDao {

//	CREATE TABLE CART_PRODUCT (
//			MEMBER_NO	NUMBER	NOT NULL,
//			PRODUCT_NO  NUMBER	NOT NULL,
//		    AMOUNT NUMBER NULL	
//		    
		public int insert(Connection conn, CartProductVo vo) {
			int result = 0;
			
			String sql = "INSERT INTO CART_PRODUCT (MEMBER_NO, PRODUCT_NO, AMOUNT) VALUES(?, ?, ?)";
			PreparedStatement pstmt = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getMember_no());
				pstmt.setInt(2, vo.getProduct_no());
				pstmt.setInt(3, vo.getAmount());
				
				result = pstmt.executeUpdate();
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JdbcTemplate.close(pstmt);
			}
			
			return result;
		}
		public int update(Connection conn, CartProductVo vo, int member_no) {
			int result = 0;
			return result;
		}
		public int delete(Connection conn,int member_no) {
			int result = 0;
			
			String sql = "DELETE FROM CART_PRODUCT WHERE MEMBER_NO";
			PreparedStatement pstmt = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, member_no);
				
				result = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JdbcTemplate.close(pstmt);
			}
			
			return result;
		}
		public List<CartProductVo> selectList(Connection conn, int member_no){
			List<CartProductVo> volist = null;
			
			String sql = "SELECT * FROM (CART_PRODUCT WHERE member_no=?) JOIN PRODUCT USING(PRODUCT_NO)";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					volist = new ArrayList<CartProductVo>();
				do {
					CartProductVo vo = new CartProductVo();
					vo = new CartProductVo();
					vo.setMember_no(rs.getInt("member_no"));
					vo.setProduct_no(rs.getInt("product_no"));
					vo.setAmount(rs.getInt("amount"));
				} while(rs.next());
				
				} 			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			JdbcTemplate.close(rs);
			JdbcTemplate.close(pstmt);
		}
			return volist;
		}
			
		public CartProductVo selectOne(Connection conn, int member_no) {
			CartProductVo vo = null;
			return vo;
		}
	
}
