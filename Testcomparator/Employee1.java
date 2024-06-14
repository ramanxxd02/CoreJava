package in.co.Testcomparator;

public class Employee1 implements Comparable<Employee1> {

    int id;
    String name;
    int salary;

    public Employee1(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee1 o) {
        if (this.name.equals(o.name)) {
            return this.salary - o.salary;
        }
        return this.id - o.id;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}
