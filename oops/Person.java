package in.co.oops;

//Constructor
public class Person {
	public Person() {
		System.out.println("i am default constructor");
	}

	public Person(int a) {
		System.out.println("i am parameter constructor");
	}

	public  Person(int a, int b) {
		System.out.println("i ma two parameter constructer");
	}

	public  Person(int a, int b, int c) {
		System.out.println("am three parameter constructor");
	}

	public static void main(String[] args) {
		Person ps = new Person();
	}
}
