package exceptionHandling;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
public class Uncommon {

	 public String[] uncommonFromSentences(String s1, String s2) {
	        
	        
	        String m1[] = s1.split(" ");
	        String m2[] = s2.split(" ");
	        Map<String,Integer> freq = new HashMap<>();

	        for(String w : m1)
	        {
	            freq.put(w, freq.getOrDefault(w,0)+1);
	        }

	        for(String w : m2)
	        {
	            freq.put(w, freq.getOrDefault(w,0)+1);
	        }
	        List<String> list = new ArrayList<>();
	        for(Map.Entry<String,Integer> entry : freq.entrySet())
	        {
	            if(entry.getValue() == 1)
	            {
	                list.add(entry.getKey());
	            }
	        }
	        return list.toArray(new String[0]);
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Uncommon s = new Uncommon();

	        String m = scan.nextLine();
	        String n = scan.nextLine();

	        String[] r  = s.uncommonFromSentences(m,n);

	        for(int k=0;k<r.length;k++)
	        {
	            System.out.print(r[k]+" ");
	        }
	    }

}
