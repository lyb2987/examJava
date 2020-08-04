package examJavaProject.DTO;

import java.util.Date;

public class MemberDTO {
	private long id;
	private String password;
	private String email;
	private String name;
	private Date registerDate;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegisterDate() {
		return registerDate;
	}
	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	public void changePassword(String oldPw, String newPw) {
		if(this.password.equals(oldPw)) {
			password = newPw;
		}
		else {
			System.out.println("현재 비밀번호가 틀립니다.");
		}
	}
}
