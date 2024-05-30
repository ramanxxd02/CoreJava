package in.co.oops;

public class AccountDetails {
public static void main(String[] args) {
	Account a=new Account();
	a.setName("Raman");
	a.setSalary(5000);
	a.setAge(22);
	System.out.println(a.getname());
	System.out.println(a.getsalary());
	System.out.println(a.getage());
	
}
}
