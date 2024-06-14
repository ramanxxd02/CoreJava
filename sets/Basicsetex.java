package in.co.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Basicsetex {
	public static void main(String[] args) {
		// set output always is randomorder
		Set s=new HashSet();
		s.add("One ");
		s.add("Two");
		s.add("Three");
		s.add("Four");
		System.out.println(s);
		Iterator it=s.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(s+"it.remove()remove all elements");
		System.out.println("--------------");
		Set s2 = new HashSet();
          s2.add(40);
          s2.add(15);
          s2.add(520);
          s2.add(05);
          s2.add(null);
          s2.add(null);
          System.out.println(s2);
          Iterator it1=s2.iterator();
          while(it1.hasNext()) {
        	  System.out.println(it1.next());
          }
	}

}
