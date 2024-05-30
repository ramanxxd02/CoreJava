//Write a program to generate a triangle
package exercise.basics;

public class Triangle {
	public static void main(String[] args) {
		int R=1;
		for(int i=R;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
