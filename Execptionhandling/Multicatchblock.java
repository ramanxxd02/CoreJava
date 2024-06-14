package in.co.Execptionhandling;

public class Multicatchblock {
public static void main(String[] args) {
	String name="Raman";
	try {
	System.out.println(name.length());
	System.out.println(name.charAt(10));
}catch(StringIndexOutOfBoundsException e) {
	System.out.println("bhaiya jii");
}
	catch(NullPointerException e){
		System.out.println(e.getMessage());
	}
	finally {
		System.out.println("hello");
	}
}
}
