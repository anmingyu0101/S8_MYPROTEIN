package kh.s8.protein.product.model;

import java.sql.*;

public class ProductVo {
 
	private int product_no;
	private String product_name;
	private String product_price;
	private String product_desc;
	@Override
	public String toString() {
		return "CartVo [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_desc=" + product_desc + "]";
	}
	
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_price() {
		return product_price;
	}
	public void setProduct_price(String product_price) {
		this.product_price = product_price;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
}
