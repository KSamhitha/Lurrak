package bvrit;

public class Land {
private int sno;
private int surveyNo;
private double area;
private String criteria;
private String doc;
private int price;
private String city;
private int pincode;
private LandCategory no;
private Owner id;


public Land(){
}
public Land(int sno, int surveyNo, double area, String criteria, String doc, int price, String city, int pincode, LandCategory no, Owner id) {
	this.sno = sno;
	this.surveyNo = surveyNo;
	this.area = area;
	this.criteria = criteria;
	this.doc = doc;
	this.price = price;
	this.city = city;
	this.pincode = pincode;
	this.no = no;
	this.id = id;
}

@Override
public String toString() {
	return "Land [sno=" + sno + ", surveyNo=" + surveyNo + ", area=" + area + ", criteria=" + criteria + ", doc=" + doc + ", price=" + price + ", city=" + city + ", pincode=" + pincode + ", no=" + no + ", id=" + id + "]";
}
public int getSno() {
	return sno;
}
public void setSno(int sno) {
	this.sno = sno;
}
public int getSurveyNo() {
	return surveyNo;
}
public void setSurveyNo(int surveyNo) {
	this.surveyNo = surveyNo;
}
public double getArea() {
	return area;
}
public void setArea(double area) {
	this.area = area;
}
public String getCriteria() {
	return criteria;
}
public void setCriteria(String criteria) {
	this.criteria = criteria;
}
public String getDoc() {
	return doc;
}
public void setDoc(String doc) {
	this.doc = doc;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
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
public LandCategory getNo() {
	return no;
}
public void setNo(LandCategory no) {
	this.no = no;
}
public Owner getId() {
	return id;
}
public void setId(Owner id) {
	this.id = id;
}

}

