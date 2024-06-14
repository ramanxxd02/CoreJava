package in.co.Execptionhandling;
//Arreyindexoutofboundsexception
public class TestArrey {
	public static void main(String[] args) {
		String s[]= {"Raman"};
		try {
		System.out.println(s.length);
		System.out.println(s[10]);
	}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.err.println(e.getMessage());
		}
	}
}
