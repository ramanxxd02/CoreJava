package exercise.basics;

public class PrimeNo {
public static void main(String[] args) {
	int num=1;
	int count=0;
	for(int i=1;i<num;i++) {
	if(num%i==0)	{
		count++;
	}
	}
	if(count==0) {
		System.out.println("this is the prime no");
	}else {
		System.out.println("this is not prime no");
	}
	
}
}

