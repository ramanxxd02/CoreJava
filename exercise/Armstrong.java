package exercise.basics;

public class Armstrong {

	public static void main(String[] args) {

		int no = 152;
		int tno = no;
		int sum = 0;
		int r = 0;

		while (tno > 0) {

			r = tno % 10;
			sum = sum + r * r * r;
			tno = tno / 10;

		}

		if (sum == no) {

			System.out.println("this is armstrong");

		} else {
			System.out.println("this is not armstrong");
		}

	}

}
