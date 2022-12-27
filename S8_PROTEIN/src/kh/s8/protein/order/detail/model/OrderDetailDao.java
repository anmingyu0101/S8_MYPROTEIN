package kh.s8.protein.order.detail.model;

import java.sql.*;
import java.util.*;

import kh.s8.protein.cart.product.model.CartProductVo;



public class OrderDetailDao {
	
	public int insert(Connection conn, OrderDetailVo vo) {
		int result = 0;
		return result;
		
	}
	public int update(Connection conn, OrderDetailVo vo, int product_no, int member_no) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, int product_no, int member_no) {
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

