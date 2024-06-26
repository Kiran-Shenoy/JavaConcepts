package collections;

import java.util.LinkedList;

public class LaunchLinkedList {

	public static void main(String[] args) {
		
		
		LinkedList lst=new LinkedList();
		
		lst.add(10);
		lst.add(20);
		lst.add(40.87f);
		lst.add("shenoy");
		lst.add(false);
		lst.add(null);
		
		System.out.println(lst);
		
		lst.addFirst(505);
		System.out.println(lst);
		
		lst.addLast(909);
		System.out.println(lst);
		
//		lst.getFirst();
		System.out.println(lst.getFirst());
		
		System.out.println(lst.getLast());
		
		
		lst.removeFirst();
		System.out.println(lst);
		
		lst.removeLast();
		System.out.println(lst);
		
		
		for(Object x:lst)
		{
			System.out.println(x);
		}
		
		

	}

}
