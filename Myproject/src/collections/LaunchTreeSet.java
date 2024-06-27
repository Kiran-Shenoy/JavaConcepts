package collections;

import java.util.TreeSet;

public class LaunchTreeSet {

	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		
		set.add(20);
		set.add(12);
		set.add(35);
		set.add(89);
		set.add(56);
		set.add(67);
		
		System.out.println(set);
		
		set.pollFirst();
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.headSet(67));
		System.out.println(set.tailSet(20));
		
		
		
		for(Object x:set)
		{
			System.out.println(x);
		}

	}

}
