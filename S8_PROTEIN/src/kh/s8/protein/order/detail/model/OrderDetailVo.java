package kh.s8.protein.order.detail.model;
import java.sql.*;
public class OrderDetailVo {

	private int product_no;
	private int order_no;
	private int count;
	@Override
	public String toString() {
		return "OrderDetailVo [product_no=" + product_no + ", order_no=" + order_no + ", count=" + count + "]";
	}
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
