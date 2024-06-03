package in.co.superDCon;

public class Triangle extends Shape {
private int base;
private int heigth;
public Triangle(String colour,int borderwidth,int base,int heigth) {
	super(colour,borderwidth);
	this.base=base;
	this.heigth=heigth;
}
public int getbase(int base) {
	return base;
}
public int getheigth(int heigth) {
	return heigth;
}
public double area() {
	return base*heigth;
}
}
