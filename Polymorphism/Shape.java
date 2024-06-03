package in.co.Polymorphism;

public class Shape {
	public Shape() {
		
	}
	public double area() {
		return 0;
	}
	public static Shape getShape(int i) {   //value ko static ur getmethod 
		if(i==1) {
			return new Circle(6);
		}
		if(i==2) {
			return new Ractangle (7,9);
		}
		if(i==3) {
			return new Triangle(7,8);
		}
		
		return new Shape();
	}

}
