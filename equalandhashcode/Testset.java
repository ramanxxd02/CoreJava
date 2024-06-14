package in.co.equalandhashcode;

public class Testset {
	public static void main(String[] args) {
		String s1="RXD";
		String s2="RXD";
		System.out.println(s1.equals(s2));//value equal hai ya nhi check krne ke liye
		System.out.println(s1.hashCode());// hashcode value dekh ne ke liye 
		System.out.println(s1.hashCode());//hashcode value dekh ne ke
		System.out.println(s1.hashCode()==s2.hashCode());// hashcode value equal hai nhi check krne ke liye
	}

}
