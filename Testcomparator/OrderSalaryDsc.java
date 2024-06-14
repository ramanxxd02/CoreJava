package in.co.Testcomparator;

import java.util.Comparator;

public class OrderSalaryDsc implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
				return o2.getSalary()- o1.getSalary();
	}

}
