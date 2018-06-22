package bvrit;

public class Property {
private Land sno;
private int price;
private Buyer id;
public Property(){
}
public Property(Land sno, int price, Buyer id) {
	this.sno = sno;
	this.price = price;
	this.id = id;
}

@Override
public String toString() {
	return "PropertyDTO [sno=" + sno + ", price=" + price + ", id=" + id + "]";
}
public Land getSno() {
	return sno;
}
public void setSno(Land sno) {
	this.sno = sno;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public Buyer getId() {
	return id;
}
public void setId(Buyer id) {
	this.id = id;
}
}
