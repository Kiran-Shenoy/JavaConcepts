package collections;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Traversing {

	public static void main(String[] args) {
		
		
	    Vector<Integer> v=new Vector<Integer>();
	    
	    v.add(1);
	    v.add(2);
	    v.add(3);
		v.add(3,78);
		
	    
	    System.out.println(v);
	    
	    Enumeration<Integer> e=v.elements();
	    while(e.hasMoreElements())
	    {
	    	Integer element =e.nextElement();
	    	System.out.println(element);
	    }
	    
	    System.out.println("---------------------------ENUMERATION");
	    
	    
	    
	    ArrayList<String>  al=new   ArrayList<String>();
	    
	    al.add("shenoy");
	    al.add("kiran");
	    al.add("ramesh");
	    al.add("veena");
	    al.add("book");
	    
	    System.out.println(al);
	    
	    Iterator<String> i=al.iterator();
	    while(i.hasNext())
	    {
	    	String name=i.next();
	    	System.out.println(name);
	    	if(name.equals("kiran"))
	    	{
	    		i.remove();
	    	}
	    }
	    System.out.println(al);
	    
	    System.out.println("---------------------------ITERATOR");
	    
	    
	    ArrayList<String> arr=new    ArrayList<String>();
	    
	    arr.add("shenoy");
	    arr.add("kiran");
	    arr.add("ramesh");
	    arr.add("veena");
	    arr.add("book");
	    
	    System.out.println(arr);
	    
	    ListIterator<String>  li=arr.listIterator();
	    System.out.println("FORWARD DIRECTION");
	    while(li.hasNext())
	    {
	    	System.out.println(li.next()+" ");
//	    	System.out.print(li.nextIndex());
	    }
	    
	    
	    System.out.println("REVERSE DIRECTION");
	    while(li.hasPrevious())
	    {
	    	System.out.println(li.previous()+" ");
//	    	System.out.print(li.nextIndex());
	    }
	    
	    System.out.println("---------------------------LISTITERATOR");
	    
	    
	    li=arr.listIterator();
	    while(li.hasNext())
	    {
	    	String name=li.next();
	    	if(name.equals("book"))
	    	{
	    		li.remove();
	    	}
	    	else if(name.equals("kiran"))
	    	{
	    		li.set("samarth");
	    	}
	    	else if(name.equals("ramesh"))
	    	{
	    		li.add("tap");
	    	}
	    }
	    
	    System.out.println("MODIFIED");
	    
	    for( String name: arr)
	    {
	    	System.out.println(name);
	    }
	    
	    
	    
	    
 
	}

}
