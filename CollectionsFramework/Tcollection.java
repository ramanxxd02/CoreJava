package in.co.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Tcollection {
	public static void main(String[] args) {
	Collection c=new ArrayList();
	c.add("Raman");
	c.add(10);
	c.add(true);
	c.add(10.20);
	System.out.println(c);
	//Collection se bhar lane ke liye
	for(Object Object:c) {
		System.out.println(Object);
	}
	}
}
