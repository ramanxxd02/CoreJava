package in.co.Basics;

public class SwappingWith {
	public static void main(String[] args) {
//		//Before swapping
//		int a=10;
//		int b=20;
//		int temp;
//		System.out.println("Before Swapping");
//		System.out.println("a="+a);
//		System.out.println("b="+b);
//		//After swapping
//		temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After Swapping");
//		System.out.println("a="+a);
//		System.out.println("b="+b);
		
		//Without Variable
		//before swapping
		int a=10;
		int b=20;
		System.out.println("Before Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
		//after swapping
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}


