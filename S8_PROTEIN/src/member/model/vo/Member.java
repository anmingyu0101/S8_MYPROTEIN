package member.model.vo;

public class Member implements java.io.Serializable {
 
	 private static final long serialVersionUID = 1L;
	 private String id;
	 private String passwd;
	 private String name;
	 private String email;

	 public Member() {}
	 public Member(String id, String passwd, String name, String email) {
	 super();
	 this.id = id;
	 this.passwd = passwd;
	 this.name = name;
	 this.email = email;
	 }
	 @Override // toString() 재정의
	 public String toString() {
	 return "Member [id=" + id + ", passwd=" + passwd + ", name=" + name + ",email=" + email + "]";
	 }
	/* …… Getter & Setter 선언부 …… */
	public String getPasswd() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getEmail() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setId(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPasswd(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	}

