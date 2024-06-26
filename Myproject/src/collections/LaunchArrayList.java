package collections;

import java.util.ArrayList;

public class LaunchArrayList {

	public static void main(String[] args) {
		
		ArrayList l=new ArrayList();
		
		l.add(10);
		l.add(20);
		l.add("tap");
		l.add(20.06f);
		l.add(true);
		l.add(3,78);
		
		System.out.println(l);
		int s =l.indexOf(20.06f);
		System.out.println(s);
		
		l.remove(2);
		System.out.println(l);
		
		int r=l.size();
		System.out.println(r);
		
		int res=l.lastIndexOf(true);
		System.out.println(res);
		
		l.set(0, 99);
		System.out.println(l);
		
		for( Object x:l)
		{
			System.out.println(x);
		}
	
		
		

	}

}
