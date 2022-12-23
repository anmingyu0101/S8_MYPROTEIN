package OrderMember;

import java.sql.*;
import java.util.List;

import member.model.vo.MemberVo;

public class OrderMemberDao {
	
	public int insert(Connection conn, OrderMemberVo vo) {
		int result = 0;
		return result;
	}

	public int update(Connection conn, OrderMemberVo vo, int order_no) {
		int result = 0;
		return result;
	}
	public int delete(Connection conn, int order_no) {
		int result = 0;
		return result;
	}
	public List<OrderMemberVo> selectList(Connection conn){
		List<OrderMemberVo> volist = null;

		return volist;
	}
	public OrderMemberVo selectOne(Connection conn, int order_no) {
		OrderMemberVo vo = null;
		return vo;
	}
	public OrderMemberVo Order(Connection conn, int order_no, int member_no, int order_date, String PostalCode, String address, int payment_total, String method_pay, int total_pay){	
		OrderMemberVo vo = null;
		
		String query = "SELECT * FROM CART_PRODUCT";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = conn.prepareStatement(query);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
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
