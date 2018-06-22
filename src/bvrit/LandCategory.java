package bvrit;

public class LandCategory {
private int no;
private String type;
private Admin id;

public LandCategory(){
}
public LandCategory(int no, String type, Admin id) {
	this.no = no;
	this.type = type;
	this.id = id;
}

@Override
public String toString() {
	return "LandCategory [no=" + no + ", type=" + type + ", id=" + id + "]";
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Admin getId() {
	return id;
}
public void setId(Admin id) {
	this.id = id;
}

}
