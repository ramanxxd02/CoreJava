package in.co.Execptionhandling;

public class TryCatchFinal {
	public static void main(String[] args) {
		String name = "Raman";
		try {

			System.out.println(name.charAt(6));
		} catch (StringIndexOutOfBoundsException e1) {
			System.out.println("String Choti hai");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("i'm always executed");
		}
	}
	}




