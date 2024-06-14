package in.co.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetex {
	public static void main(String[] args) {
		HashSet s=new HashSet();
		s.add("One");
		s.add("Two");
		s.add("Three");
		s.add("Four");
		System.out.println(s);
		System.out.println("----------");
		Iterator it=s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		HashSet s2=new HashSet();
		s2.add(10);
		s2.add(20);
		s2.add(30);
		s2.add(40);
		s2.add(null);
		System.out.println("-------");
		System.out.println(s2);
	  //System.out.println(s.contains(4));
		s2.remove(1);
		//System.out.println(s2.size());
		Iterator itr=s2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		//s.add("a");
		}
	}

}
