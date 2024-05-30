package in.co.oops;
//Using this keyword
public class Personthis {
	public Personthis() {
		System.out.println("i am default constructor");
	}

	public Personthis(int a) {
		this();
		System.out.println("i am parameter constructor");
	}

	public  Personthis(int a, int b) {
		this(a);
		System.out.println("i am two parameter constructer");
	}

	public  Personthis(int a, int b, int c) {
		this(a,b);
		System.out.println("i am three parameter constructor");
	}

	public static void main(String[] args) {
		Personthis ps = new Personthis(10,20,30);
	}

}
