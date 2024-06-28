package collections;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class LaunchTreeMap {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> t=new TreeMap<String,Integer>();
		
		t.put("India", 5000);
		t.put("China", 300);
		t.put("America", 800);
		t.put("usa", 500);
		t.put("japan", 1000);
		t.put("russia", 6090);
		t.put("korea", 4909);
		
		System.out.print(t);
		
		Set<Entry<String, Integer>> entrySet=t.entrySet();
		
		for(Entry<String, Integer> entry:entrySet)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		Object r=t.get("japan");
		System.out.println(r);
		
		
		Set s=t.keySet();
		System.out.println(s);
		
	    Object f= t.pollFirstEntry();
		System.out.println(f);
		
		Object v=t.values();
		System.out.println(v);
		
		Object c=t.containsKey("russia");
		System.out.println(c);
		
		t.remove("korea");
		System.out.println(t);
		
	}

}
