package in.co.CollectionsFramework;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		// create a collection
		Collection c = new ArrayList();
		// add elements into collection
		c.add("hello");  // index#0
		c.add("hey");    // index#1
		c.add("bye");    // index#2
		for(Object Object:c) {
			System.out.println(Object);
		}
		//length of collection
		System.out.println(c);
		System.out.println("length of collection="+c.size());
		//print all elements of collection
		for(Object ele:c) {
		 System.out.println(ele);
		}
		//convert  collection into array
		Object[]oArray=c.toArray();
		//print all elements of array
        for(Object ele:oArray) {
        	String s=(String)ele;
        	System.out.println(s);
        }
	}
}
