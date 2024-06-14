package in.co.Testcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testemp1 {

    public static void main(String[] args) {

        List<Employee1> list = new ArrayList<>();

        list.add(new Employee1(4, "Raman", 2000));
        list.add(new Employee1(2, "megha", 3000));
        list.add(new Employee1(3, "Captain", 4000));
        list.add(new Employee1(1, "Raman", 5000));
        list.add(new Employee1(5, "himanshi", 6000));

//        Collections.sort(list); // Sorting based on Comparable implementation
//        Collections.sort(list, new OrderbyidAsc()); // Sorting based on Comparator implementation
//        Collections.sort(list, new OrderbyIdDsc()); // Uncomment to sort in descending order by ID
//        Collections.sort(list, new OrderSalaryAsc());
//        Collections.sort(list, new OrderSalaryDsc());
        for (Employee1 employee : list) {
            System.out.println(employee);
        }
    }
}
