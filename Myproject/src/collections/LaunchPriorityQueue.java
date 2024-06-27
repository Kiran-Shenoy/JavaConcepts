package collections;

import java.util.PriorityQueue;

public class LaunchPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue pq=new PriorityQueue();
		
		
		pq.add(4);
		pq.add(7);
		pq.add(3);
		pq.add(9);
		pq.add(45);
		
		System.out.println(pq);
		Object min=pq.remove();
		System.out.println(min);
		System.out.println(pq);
		
		pq.offer(40);
		System.out.println(pq);
		
		Object r=pq.poll();
		System.out.println(r);
		System.out.println(pq);
		
		
		Object e=pq.element();
		System.out.println(e);
		System.out.println(pq);
		
		Object s=pq.peek();
		System.out.println(s);
		System.out.println(pq);
		
		for(Object x:pq)
		{
			System.out.println(x);
		}
		

	}
	

}
