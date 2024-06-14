package in.co.sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetex {
	public static void main(String[] args) {
		//Sortedset output by default ASC order
	SortedSet s=new TreeSet();
     s.add(9);
     s.add(20);
     s.add(10);
     System.out.println("last:"+s.last());
     System.out.println("first:"+s.first());
     System.out.println(s);
     for (Object ele : s) {
	 System.out.println(ele);
	}
	}

}
