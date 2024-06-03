package in.co.abstraction;

public class Triangle extends Shape {
	private int base;
	private int heigth;
	public int getbase() {
		return base;
	}
	public int getheigth() {
		return heigth;
	}
	public void setbase(int base) {
		this.base=base;
	}
	public void setheigth(int heigth) {
		this.heigth=heigth;
	}
	//@override
	public double area() {
		return base*heigth;
	}

}
