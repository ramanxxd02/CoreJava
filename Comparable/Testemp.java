package in.co.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testemp {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(new Employee(02,"R",1000));
	l.add(new Employee(04,"A",2000));
	l.add(new Employee(07,"M",3000));
	l.add(new Employee(05,"A",4000));
	l.add(new Employee(06,"N",5000));

	Collections.sort(l);
	for (Object object : l) {
		System.out.println(object);
	}
	
}

}
