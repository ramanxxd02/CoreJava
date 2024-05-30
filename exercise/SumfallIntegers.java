package exercise.basics;

public class SumfallIntegers {
public static void main(String[] args) {
	int sum=0;
	int count=0;
	for( int i=101;i<200;i++) {
		if(i%7==0) {
		sum=sum+i;
		count++;
		}
	}
	System.out.println("the sumof the number between 100 to 200 which are divisible by is:"+sum);
	System.out.println("total numbers between 100 to 200 which are divisible by 7 is:"+count);
	}
}


