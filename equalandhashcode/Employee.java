package in.co.equalandhashcode;

public class Employee {
	int id;
	String name;
	int salary;
	public Employee(int id, String name,int salary) {
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
		public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(!(obj instanceof Employee)) {
			return false;
		}
		Employee e=(Employee)obj;
		boolean b=this.id==e.id && this.name==e.name&&this.salary==e.salary;
		return b;
}
		@Override
		public int hashCode() {
			String Str =id+name+salary;
			return Str.hashCode();
		}
		@Override
		public String toString() {
			return "id="+id+"name="+name+"salary="+salary;		}
		
}
