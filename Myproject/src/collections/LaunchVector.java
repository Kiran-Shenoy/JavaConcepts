package collections;

import java.util.Vector;

public class LaunchVector {

	public static void main(String[] args) {
		
		
		Vector v=new Vector();
		
		
		v.add(10);
		v.add(20);
		v.add("tap");
		v.add(20.06f);
		v.add(true);
		v.add(3,78);
		
		
		System.out.println(v);

		
		int s =v.indexOf(20.06f);
		System.out.println(s);
		
		v.remove(2);
		System.out.println(v);
		
		int r=v.size();
		System.out.println(r);
		
		int res=v.lastIndexOf(true);
		System.out.println(res);
		
		v.set(0, 99);
		System.out.println(v);
		
		
		v.insertElementAt(999, 4);
		System.out.println(v);
		
		
		System.out.println(v.firstElement());
		System.out.println();
		
		
		
		
		for( Object x:v)
		{
			System.out.println(x);
		}
	}

}
