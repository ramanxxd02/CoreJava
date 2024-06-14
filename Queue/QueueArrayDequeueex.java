package in.co.Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueArrayDequeueex {
public static void main(String[] args) {
	Queue q=new ArrayDeque();
	q.offer("Raman");
	q.offer(02);
	
	System.out.println(q);
	System.out.println(q.peek());
	System.out.println(q.poll());
	System.out.println(q);
}
}
