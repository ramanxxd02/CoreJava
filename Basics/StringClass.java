package in.co.Basics;

public class StringClass {
	public static void main(String[]args) {
		String name="RamanDange";
		System.out.println(name);
	System.out.println(name.length());
		System.out.println(name.charAt(0));
		System.out.println(name.indexOf("Dange"));
		System.out.println(name.indexOf("D"));
		System.out.println(name.lastIndexOf("n"));
		System.out.println(name.lastIndexOf("g"));
		System.out.println(name.replace("R","D"));
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.startsWith("Raman"));
		System.out.println(name.endsWith("Dange"));
		System.out.println(name.substring(5));
	}

}
