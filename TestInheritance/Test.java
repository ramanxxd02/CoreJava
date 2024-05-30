package in.co.TestInheritance;

public class Test {

	public static void main(String[] args) {

		Circle c = new Circle();
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
        
		t.setBase(20);
		t.setHeight(40);
		c.setRadius(20.20);
		r.setLength(30);
		r.setWidth(30);

		System.out.println("area of Circle is"+c.area());
		System.out.println("area of Rectangle is"+r.area());
		System.out.println("area of Triangle is"+t.area());

	}

}
