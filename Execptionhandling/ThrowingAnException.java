package in.co.Execptionhandling;

public class ThrowingAnException {

	public static void main(String[] args) {
		try {
			checkAge(10);//this will throw an exception
			}catch(IllegalArgumentException e) {
				System.out.println("Exception:"+e.getMessage());
			}
		
	}
	public static void checkAge(int Age) {
		if(Age<18) {
			throw new IllegalArgumentException("Age must be 18 or above to vote.");
		}else {
			System.out.println("you are eligible to vote.");
		}
	}
}
