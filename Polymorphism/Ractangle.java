package in.co.Polymorphism;

public class Ractangle extends Shape{
	private int length;
	private int width;
	public Ractangle() {
		
	}
	public Ractangle(int length,int width) {
		this.length=length;
		this.width=width;
	}
	public double area() {
		return length*width;
	}

}
