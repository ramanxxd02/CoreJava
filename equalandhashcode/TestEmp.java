package in.co.equalandhashcode;

public class TestEmp {
	public static void main(String[] args) {
		
	Employee e1=new Employee(02,"raman",2300);
	Employee e2=new Employee(02,"Raman",2100);
	System.out.println(e1);
	System.out.println(e2);
	System.out.println(e1.hashCode()==e2.hashCode());
	}
}
