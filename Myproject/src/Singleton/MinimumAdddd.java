package Singleton;
import java.util.*;
public class MinimumAdddd {

	 public int addMinimum(String word) {
	        
	        int blocks=1;
	        for(int i=1;i< word.length();i++)
	        {
	            if(word.charAt(i) <= word.charAt(i-1))
	            {
	                blocks++;
	            }
	        }
	        return (blocks * 3) - word.length();

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan =new Scanner(System.in);
	        MinimumAdddd s = new MinimumAdddd();

	        String st = scan.next();

	        int r = s.addMinimum(st);

	        System.out.print(r);
	    }

}
