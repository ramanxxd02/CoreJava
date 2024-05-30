package in.co.TestInheritance;

public class Circle1 extends Shape1 {
	private double radius=3.14; 
	public  double getradius() {
		return radius;
	}
	public void setradius(double radius) {
	this.radius=radius;
	}
	@Override
	public double area() {
		
		return 3.14*radius*radius;
	}
	
}
