package bvrit;

public class LandImages {

private Land sno;
private String image;

public LandImages(){
}
public LandImages(Land sno, String image) {
	this.sno = sno;
	this.image = image;
}

@Override
public String toString() {
	return "LandImages [sno=" + sno + ", image=" + image + "]";
}
public Land getSno() {
	return sno;
}
public void setSno(Land sno) {
	this.sno = sno;
}
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
}