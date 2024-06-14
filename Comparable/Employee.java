package in.co.Comparable;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	public Employee(int id,String name,int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
	@Override
	public int compareTo(Employee e) {
		if(this.name==e.name) {
			return this.salary-e.salary;
		}
		return this.id-e.id;
	}
	@Override
	public String toString() {
		return "id="+" "+id+"name="+name+" "+"salary="+" "+salary;
		}
	
}
