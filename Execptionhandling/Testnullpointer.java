package in.co.Execptionhandling;
//Nullpointer Execption
public class Testnullpointer {
	public static void main(String[] args) {
		String name=null;
		try {
			System.out.println(name.length());
		}catch(NullPointerException e) {
			System.err.println("bhaiya jii");
		}
	}

}
