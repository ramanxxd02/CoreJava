package exercise.basics;

public class FactorialNO {
	public static void main(String[] args) {
		int fact=1;
		int num=6;
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial no="+fact);
	}

}
