package in.co.Execptionhandling;
// Index out of bounds exectpion
public class Testindex {
	public static void main(String[] args) {
		String s="Raman";
		try {
		System.out.println(s.length());
		System.out.println(s.charAt(10));
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("length choti hai");
	}
	}
}
