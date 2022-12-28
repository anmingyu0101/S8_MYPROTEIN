package kh.s8.protein.product.image.model;

import static kh.s8.protein.common.jdbc.JdbcTemplate.*;

import java.sql.Connection;
import java.util.List;


public class ProductImageService {
	private ProductImageDao dao = new ProductImageDao();
	
	public int insert(ProductImageVo vo) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.insert(conn, vo);
		if(result > 0) commit(conn);
		else rollback(conn);
		return result;
	}
	public int update(ProductImageVo vo, String product_img) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.update(conn, vo, product_img);
		if(result > 0) commit(conn);
		else rollback(conn);
		return result;	
	}
	
	public int delete (String product_img) {
		int result = 0;
		Connection conn = getConnection();
		result = dao.delete(conn, product_img);
		if(result > 0) commit(conn);
		else rollback(conn);
		return result;
	}
	
	public ProductImageVo selectOne(String product_img) {
		ProductImageVo vo = null;
		Connection conn = getConnection();
		vo = dao.selectOne(conn, product_img);
		close(conn);
		return vo;
	}
	public ProductImageVo Product(String product_img, int product_no,int count) {
		ProductImageVo vo = null;
		Connection conn = getConnection();
		vo = dao.Product(conn, product_img, product_no, count);
		close(conn);
		return vo;
	}
}
