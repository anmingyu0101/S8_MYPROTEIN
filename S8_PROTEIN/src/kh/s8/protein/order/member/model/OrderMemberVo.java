package kh.s8.protein.order.member.model;

import java.sql.*;

public class OrderMemberVo {

	private int order_no;
	private int member_no;
	private Timestamp order_date;
	private String PostalCode;
	private String address;
	private int payment_total;
	private String method_pay;
	private int total_pay;
	@Override
	public String toString() {
		return "OrderMemberVo [order_no=" + order_no + ", member_no=" + member_no + ", order_date=" + order_date
				+ ", PostalCode=" + PostalCode + ", address=" + address + ", payment_total=" + payment_total
				+ ", method_pay=" + method_pay + ", total_pay=" + total_pay + "]";
	}
	public int getOrder_no() {
		return order_no;
	}
	public void setOrder_no(int order_no) {
		this.order_no = order_no;
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public Timestamp getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Timestamp order_date) {
		this.order_date = order_date;
	}
	public String getPostalCode() {
		return PostalCode;
	}
	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPayment_total() {
		return payment_total;
	}
	public void setPayment_total(int payment_total) {
		this.payment_total = payment_total;
	}
	public String getMethod_pay() {
		return method_pay;
	}
	public void setMethod_pay(String method_pay) {
		this.method_pay = method_pay;
	}
	public int getTotal_pay() {
		return total_pay;
	}
	public void setTotal_pay(int total_pay) {
		this.total_pay = total_pay;
	}

	
	
}
