package kh.s8.protein.product.image.model;

import java.sql.*;

public class ProductImageVo {
	private String product_img;
	private int product_no;
	private int count;
	@Override
	public String toString() {
		return "ProductImageVo [product_img=" + product_img + ", product_no=" + product_no + ", count=" + count + "]";
	}
	public String getProduct_img() {
		return product_img;
	}
	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

}
