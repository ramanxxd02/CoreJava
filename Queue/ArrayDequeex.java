package in.co.Queue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeex {
	public static void main(String[] args) {
		ArrayDeque q=new ArrayDeque();
		//offer pool peek =addition methods
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offerFirst(40);
		q.offerLast(50);
		System.out.println(q);
		//peeklast()get last element
		System.out.println(q.peek()+"get top element");
		System.out.println(q);
	    //polllast()get and remove last element
		System.out.println(q.poll()+"get top element and remove");
		q.forEach(System.out::println);
		Iterator it = q.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
