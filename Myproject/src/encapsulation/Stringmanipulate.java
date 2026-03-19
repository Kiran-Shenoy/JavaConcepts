package encapsulation;
import java.util.Scanner;
public class Stringmanipulate {

	 public int[] diStringMatch(String s) {
	        int a[] = new int[s.length()+1];
	        int low = 0;
	        int high = s.length();

	        for(int i=0;i<s.length();i++)
	        {
	            if(s.charAt(i) == 'I')
	            {
	                a[i] = low;
	                low++;
	            }
	            else
	            {
	                a[i] = high;
	                high--;
	            }
	        }
	    
	        a[s.length()] = low;
	        
	        return a;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Stringmanipulate s = new Stringmanipulate();

	        String st = scan.next();

	        int[] r = s.diStringMatch(st);

	        for(int k=0;k<r.length;k++)
	        {
	            System.out.print(r[k]+" ");
	        }
	    }

}
