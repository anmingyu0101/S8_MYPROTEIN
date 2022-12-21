package member.model.vo;

import java.sql.Date;

public class MemberVo {
//	ID NOT NULL VARCHAR2(20)
//	PW NOT NULL VARCHAR2(20)
//	NAME NOT NULL VARCHAR2(20)
//	EMAIL NOT NULL VARCHAR2(40)
//	PHONE NULL VARCHAR2(20)
//	
//	
//	

	private String id;
	private String pw;
	private String name;
	private String email;
	private int phone;
	
	
	public MemberVo() {
		super();
	}

	@Override
	public String toString() {
		return "MemberVo [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", ";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	
	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	

}
	
