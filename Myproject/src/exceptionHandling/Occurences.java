package exceptionHandling;
import java.util.Scanner;
public class Occurences {

	 public boolean areOccurrencesEqual(String s) {
	        
	        int freq[] = new int[26];
	        for(char c : s.toCharArray())
	        {
	            freq[c - 'a']++;
	        }

	        int expected =0;
	        for(int f : freq)
	        {
	            if(f > 0){
	                if(expected == 0) expected = f;
	                else if(f != expected)
	                {
	                    return false;
	                }
	            }
	        }
	        return true;

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Occurences s = new Occurences();

	        String st = scan.next();

	        boolean r = s.areOccurrencesEqual(st);

	        System.out.print(r);
	    }

}
