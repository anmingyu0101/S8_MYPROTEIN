package CartProduct;

public class CartProductVo {

	private int member_no;
	private int product_no;
	private int count;
	@Override
	public String toString() {
		return "CartProductVo [member_no=" + member_no + ", product_no=" + product_no + ", count=" + count + "]";
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
