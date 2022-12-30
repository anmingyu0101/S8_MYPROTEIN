package kh.s8.protein.cart.product.model;

public class CartProductVo {

	private int member_no;
	private int product_no;
	private int amount;
	@Override
	public String toString() {
		return "CartProductVo [member_no=" + member_no + ", product_no=" + product_no + ", amount=" + amount + "]";
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}
	public int getProduct_no() {
		return product_no;
	}
	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}

