package in.co.Polymorphism;

public class Circle extends Shape {
private int radius;
	public Circle() {
	
}
public Circle(int radius) {
this.radius=radius;
}
public double area() {
	return 3.14*radius*radius;
}
}
