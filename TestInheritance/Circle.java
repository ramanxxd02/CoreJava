package in.co.TestInheritance;

public class Circle extends Shape {

	private double radius = 3.14;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double area() {
		return 2 * 3.14 * radius;

	}

}
