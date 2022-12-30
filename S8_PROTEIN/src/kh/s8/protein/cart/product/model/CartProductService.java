package kh.s8.protein.cart.product.model;

import static kh.s8.protein.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import kh.s8.protein.common.jdbc.JdbcTemplate;


public class CartProductService {
	private CartProductDao dao = new CartProductDao();
	
	public int insert(CartProductVo vo) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		return result;
	}
	
	public int update(CartProductVo vo, int product_no) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.update(conn, vo, product_no);
		JdbcTemplate.close(conn);
		return result;
	}
	
	public int delete(int product_no) {
		int result = 0;
		Connection conn = JdbcTemplate.getConnection();
		result = dao.delete(conn, product_no);
		JdbcTemplate.close(conn);
		return result;
		
	}
	public List<CartProductVo> selectList(int member_no){
		List<CartProductVo> volist = null;
		Connection conn = JdbcTemplate.getConnection();
		volist = dao.selectList(conn, member_no);
		JdbcTemplate.close(conn);
		return volist;
}
	public CartProductVo selectOne(int member_no) {
		CartProductVo vo = null;
		Connection conn = JdbcTemplate.getConnection();
		vo = dao.selectOne(conn, member_no);
		JdbcTemplate.close(conn);
		return vo;		
	}
}


