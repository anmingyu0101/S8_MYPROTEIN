package kh.s8.protein.member.model;

import java.sql.Date;

public class MemberVo {

//	MEMBER_NO NOT NULL NUMBER       
//	ID        NOT NULL VARCHAR2(20) 
//	PW        NOT NULL VARCHAR2(20) 
//	NAME      NOT NULL VARCHAR2(20) 
//	EMAIL     NOT NULL VARCHAR2(40) 
//	PHONE              VARCHAR2(20)

	private int member_no;
	private String id;
	private String pw;
	private String name;
	private String email;
	private String phone;
	@Override
	public String toString() {
		return "MemberVo [member_no=" + member_no + ", id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + "]";
	}
	public int getMember_no() {
		return member_no;
	}
	public void setMember_no(int member_no) {
		this.member_no = member_no;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}
	
