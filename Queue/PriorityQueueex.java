package in.co.Queue;

import java.util.PriorityQueue;

public class PriorityQueueex {
public static void main(String[] args) {
//	PriorityQueue p=new PriorityQueue();
//	p.add(10);
//	p.add(1.2);
//	p.add(20);
//	p.add('R');
	// in priorityQueue if you add a data type first then you don't add other data
	// type in this if you add it gives classcastexception at runtime
	//example we add string first in this program so we cannot add other data type
	//if we add int first so we cannot add string or other data type
	PriorityQueue q=new PriorityQueue();
	q.offer("One");
	q.offer("Two");
	q.offer("Three");
	System.out.println(q);
	
	System.out.println(q.peek());
	System.out.println(q);
	
	System.out.println(q.poll());
	System.out.println(q);
	
	Object ele =q.element();
	System.out.println(ele);
	
	ele=q.remove();
	System.out.println(q);
	System.out.println(ele);
	}
}
