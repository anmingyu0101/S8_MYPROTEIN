package kh.s8.protein.product.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import kh.s8.protein.common.jdbc.JdbcTemplate;



public class ProductDao {

		public int insert(Connection conn, ProductVo vo) {
			int result = 0;
			
			String sql = "INSERT INTO PRODUCT(PRODUCT_NO, PRODUCT_NAME, PRODUCT_PRICE,PRODUCT_DESC)";
			sql +=	"VALUES((SELECT NVL(MAX(PRODUCT_NO), 0) + 1 FROM PRODUCT) ,?, ?, ? , ?)";
							
			PreparedStatement pstmt = null;
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, vo.getProduct_no());
				pstmt.setString(2, vo.getProduct_name());
				pstmt.setInt(3, vo.getProduct_price());
				pstmt.setString(4, vo.getProduct_desc());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JdbcTemplate.close(pstmt);
			}
			
			return result;
		}
		
		public int update(Connection conn, ProductVo vo, int product_no) {
			System.out.println("ProductDao update param vo : " + vo);
			System.out.println("ProductDao update param product_no : " + product_no);
			int result = 0;
			
			String sql = "update product set PRODUCT_NAME=? AND PRODUCT_PRICE=? AND PRODUCT_DESC=? WHERE PRODUCT_NO=?";
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, vo.getProduct_name());
				pstmt.setInt(2, vo.getProduct_price());
				pstmt.setString(3, vo.getProduct_desc());
				pstmt.setInt(4, vo.getProduct_no());
				result = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JdbcTemplate.close(pstmt);
			}
			System.out.println("ProductDao update return : " + result);
			return result;
			
		}
		public int delete(Connection conn, int product_no) {
			System.out.println("ProductDao delete param product_no : " + product_no);
			int result = 0;
			
			String sql = "delete from product where product_no=?";
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, product_no);
				result = pstmt.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JdbcTemplate.close(pstmt);
			}
			System.out.println("ProductDao delete return : " + result);
			return result;
			
		}
		public List<ProductVo> selectList(Connection conn){
			List<ProductVo> volist = null;
			
			String sql = "select * from product";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					volist = new ArrayList<ProductVo>();
					do {
						ProductVo vo = new ProductVo();
						vo.setProduct_no(rs.getInt("product_no"));
						vo.setProduct_name(rs.getString("prodcut_name"));
						vo.setProduct_desc(rs.getString("product_desc"));
						vo.setProduct_price(rs.getInt("product_price"));
						pstmt.setString(1, vo.getProduct_name());
						pstmt.setInt(2, vo.getProduct_price());
						pstmt.setString(3, vo.getProduct_desc());
						volist.add(vo);
					
				}while(rs.next());
			}
						
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JdbcTemplate.close(rs);
				JdbcTemplate.close(pstmt);
			}
			System.out.println("ProductDao selectLsit return : " + volist);
			return volist;
}
		public ProductVo selectOne(Connection conn, int product_no) {
			System.out.println("ProductDao selectOne param product_no : " + product_no);
			ProductVo vo = null;
			
			String sql = "select * from product where product_no=?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, product_no);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					vo = new ProductVo();
					vo.setProduct_no(rs.getInt("product_no"));
					vo.setProduct_name(rs.getString("prodcut_name"));
					vo.setProduct_desc(rs.getString("product_desc"));
					vo.setProduct_price(rs.getInt("product_price"));
				}
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				JdbcTemplate.close(rs);
				JdbcTemplate.close(pstmt);
			}
			System.out.println("ProductDao selectOne return : " + vo);
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