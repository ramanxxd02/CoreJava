package in.co.sets;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetex {
	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		System.out.println(s);
		Iterator it =s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
