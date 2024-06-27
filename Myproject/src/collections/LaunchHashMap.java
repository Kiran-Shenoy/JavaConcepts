package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LaunchHashMap {

	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		
		h.put("India", 9000);
		h.put("China", 900);
		h.put("Sri Lanka", 300);
		h.put("Pakisthan", 100);
		h.put("Germany",600);
		h.put("Canada", 500);
		h.put("Dubai",600);
		
		System.out.println(h);
		
		Set<Entry<String,Integer>> entry=h.entrySet();
		
		
		for(Entry<String,Integer> x:entry)
		{
			System.out.println(x);
		}
		
		Set s=h.keySet();
		System.out.println(s);
		
		h.remove("Pakisthan");
		System.out.println(h);
		
		
		Collection<Integer> v=h.values();
		System.out.println(v);
		
		Integer o=h.get("Dubai");
		System.out.println(o);
		
		
		h.put("Africa",7000);
		System.out.println(h);
		
		
		h.replace("China", 900, 250);
		System.out.println(h);

	}

}
