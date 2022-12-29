package kh.s8.protein.product.model;

import java.sql.*;
import java.util.List;

import kh.s8.protein.product.image.model.ProductImageVo;

public class ProductVo {
//	PRODUCT_NO    NOT NULL NUMBER        
//	PRODUCT_NAME           VARCHAR2(30)  
//	PRODUCT_PRICE          VARCHAR2(10)  
//	PRODUCT_DESC           VARCHAR2(100) 
	private int product_no;
	private String product_name;
	private int product_price;
	private String product_desc;
	private List<ProductImageVo> product_image_list;
	
	
	@Override
	public String toString() {
		return "ProductVo [product_no=" + product_no + ", product_name=" + product_name + ", product_price="
				+ product_price + ", product_desc=" + product_desc + ", product_image_list=" + product_image_list + "]";
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
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_desc() {
		return product_desc;
	}
	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}
	public List<ProductImageVo> getProduct_image_list() {
		return product_image_list;
	}
	public void setProduct_image_list(List<ProductImageVo> product_image_list) {
		this.product_image_list = product_image_list;
	}
}
