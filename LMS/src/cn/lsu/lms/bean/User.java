package cn.lsu.lms.bean;

public class User {

	private int userId;
	private int isAdmin;
	private String name;
	private String email;
	private int isInBlack;
	private String phone;
	private String password;
	
/*	public User(){
		
	}
	
	public User(int userId, int isAdmin, String name, String email, int isInBlack, String phone, String password) {
		super();
		this.userId = userId;
		this.isAdmin = isAdmin;
		this.name = name;
		this.email = email;
		this.isInBlack = isInBlack;
		this.phone = phone;
		this.password = password;
	}*/
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
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
	public int getIsInBlack() {
		return isInBlack;
	}
	public void setIsInBlack(int isInBlack) {
		this.isInBlack = isInBlack;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
