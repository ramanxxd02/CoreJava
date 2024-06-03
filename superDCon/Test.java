package in.co.superDCon;

public class Test {
	public static void main(String[] args) {
		Ractangle r = new Ractangle("red", 10, 20, 30);
		Triangle t = new Triangle("black", 10, 50, 60);
		System.out.println("area of Ractangle=" + r.area());
		System.out.println("area of Triangle=" + t.area());
		System.out.println(r.getcolour());
		System.out.println(t.getcolour());

	}

}
