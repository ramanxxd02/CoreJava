package in.co.Basics;

public class Buffer {
	public static void main(String[] args) {
		String name = "Raman Dange";
		StringBuffer sb=new StringBuffer("Raman");
		sb.append("Dange");
		System.out.println(name);
		System.out.println(sb);
		System.out.println("Length:"+sb.length());
		System.out.println("Capacity:"+sb.capacity());
	System.out.println("char at:"+sb.charAt(2));
		System.out.println("Index of:"+sb.indexOf("Dange"));
		System.out.println("Replace:"+sb.replace(0, 5, "Raman"));
		System.out.println("Reverse:"+sb.reverse());
		
	}

	
}
