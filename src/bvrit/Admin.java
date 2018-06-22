package bvrit;
public class Admin {
	private int id;
	private String password;
	private int phone;
	public Admin() {
	}
	public Admin(int id, String password, int phone) {
		this.id = id;
		this.password = password;
		this.phone = phone;
		}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", password=" + password + ", phone=" + phone + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
				
	}








