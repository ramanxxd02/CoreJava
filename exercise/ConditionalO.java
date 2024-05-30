//Find the smaller to two numbers using the conditinal operator
package exercise.basics;

public class ConditionalO {
	public static void main(String[] args) {
		int i=10;
		int j=20;
		if(i>j||j>i) {
			System.out.println("minimum no="+i);
		}
		else {
			System.out.println("maximum no="+j);
		}
	}

}
