package in.co.Polymorphism;

public class Triangle extends Shape {
private int base;
private int heigth;
public Triangle() {
	
}
public Triangle(int base,int heigth) {
	this.base=base;
	this.heigth=heigth;
}
public double area() {
	return base*heigth;
}
}
