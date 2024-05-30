package in.co.oops;
//Using constructor and get method
public class personconget {
	private String name;
	private String address;
	private String city;
	public personconget(String name,String address,String city) {
		this.name=name;
		this.address=address;
		this.city=city;
	}
	public personconget() {
	System.out.println("i am default ");	
	}
	public String getname() {
      return name;
}
	public String getaddress() {
		return address;
	}
	public String getcity() {
		return city;
	}
	public static void main(String[] args) {
		personconget pcg=new personconget("RAMAN","Indore","Indore");
		System.out.println(pcg.name+pcg.address+pcg.city);
	}
}
