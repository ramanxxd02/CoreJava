package exercise.basics;

public class FibonacciSerice {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println(a+" ");
			a=b;
			a=c;
		}
	}

}
