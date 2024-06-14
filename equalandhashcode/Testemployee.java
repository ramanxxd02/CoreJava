package in.co.equalandhashcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Testemployee{
	public static void main(String[] args) {
		Employee e1=new Employee(02,"Raman",25000);
		List l=new ArrayList();
		l.add(e1);
		Employee e=new Employee(02,"Raman",25000);
		System.out.println(l.contains(e));
	}
	
}
