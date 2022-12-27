package kh.s8.protein.product.model;

import static kh.s8.protein.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;


public class ProductService {
	private ProductDao dao = new ProductDao();
	
	public int insert(ProductVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	
	public int update(ProductVo vo, int product_no) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, product_no);
		if(result > 0) commit(conn);
		else rollback(conn);
		close(conn);
		return result;
	}
	public int delete(int product_no) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, product_no);
		if(result > 0) commit(conn);
		else rollback(conn);
		return result;
	}
	public List<ProductVo> selectList(){
		List<ProductVo> volist = null;
		Connection conn = getConnection();
		volist = dao.selectList(conn);
		close(conn);
		return volist;
		
	}
	
	public ProductVo selectOne(int product_no) {
		ProductVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, product_no);
		close(conn);
		return vo;
	}
	public ProductVo Cart(int product_no, String product_name, String product_price ,String product_desc) {
		ProductVo vo = null;
		Connection conn = getConnection();
		vo = dao.Cart(conn, product_no, product_name, product_price, product_desc);
		close(conn);
		return vo;
	}
	
}
