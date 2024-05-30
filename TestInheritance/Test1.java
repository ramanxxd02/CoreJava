package in.co.TestInheritance;

public class Test1 {
 public static void main(String[] args) {
	Circle1 c1=new Circle1();
	Rectangle1 r1=new Rectangle1();
	Triangle1 t1=new Triangle1();
	c1.setradius(20);
	t1.setbase(10);
	t1.setheight(30);
	r1.setlength(50);
	r1.setwidth(40);
	System.out.println("area of circle"+c1.area());
	System.out.println("arae of ractangle"+r1.area());
	System.out.println("area of triangle"+t1.area());
}

}
