package bvrit;

public class Owner {
private int id;
private String name;
private String email;
private String password;
private int phone;
private int houseNo;
private String colony;
private String city;
private int pincode;

public Owner(){
}
public Owner(int id, String name, String email, String password, int phone, int houseNo, String colony, String city, int pincode) {
	this.id = id;
	this.name = name;
	this.email = email;
	this.password = password;
	this.phone = phone;
	this.houseNo = houseNo;
	this.colony = colony;
	this.city = city;
	this.pincode = pincode;
}

@Override
public String toString() {
	return "Owner [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", phone=" + phone + ", houseNo=" + houseNo + ", colony=" + colony + ", city=" + city  + ", pincode=" + pincode + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public int getHouseNo() {
	return houseNo;
}
public void setHouseNo(int houseNo) {
	this.houseNo = houseNo;
}
public String getColony() {
	return colony;
}
public void setColony(String colony) {
	this.colony = colony;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}

}
