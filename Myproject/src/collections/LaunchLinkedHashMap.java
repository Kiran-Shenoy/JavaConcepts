package collections;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LaunchLinkedHashMap {

	public static void main(String[] args) {
		LinkedHashMap lh=new LinkedHashMap();
		
		lh.put("Inida", 7890);
		lh.put("China", 300);
		lh.put("korea", 6540);
		lh.put("japan", 7000);
		lh.put("dubai", 9000);
		lh.put("africa", 3000);
		
		System.out.println(lh);
		Set<Entry<String,Integer>> entrySet=lh.entrySet();
		
		for(Entry<String,Integer> entry:entrySet)
		{
			System.out.println(entry);
		}
		
		Object k=lh.keySet();
		System.out.println(k);
		
		Object e=lh.isEmpty();
		System.out.println(e);
		
		lh.remove("japan");
		System.out.println(lh);
		
		Object r=lh.replace("china", 300);
		System.out.println(r);
		
		int s=lh.size();
		System.out.println(s);
		
		

	}

}
