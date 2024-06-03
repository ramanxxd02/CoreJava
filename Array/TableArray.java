package in.co.Array;

public class TableArray {
	public static void main(String[] args) {
		int []a = {1,2,3,4,5,6,7,8,9,10};
	for(int i=1;i<a.length;i++) {
		for(int j=2;j<=10;j++) {
			System.out.print(j+"x"+i+"="+(i*j)+"\t");
		}
		System.out.println(" ");
	}
	
	}
}
