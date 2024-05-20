package in.co.Basics;

public class HelloNameif1 {
	public static void main(String[] args) {
		if(args.length==1) {
			System.out.println("hello"+args[0]);
		}else {
			System.out.println("parameter name is required");
		}
	}

}
