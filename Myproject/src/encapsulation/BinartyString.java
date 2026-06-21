package encapsulation;
import java.util.*;
public class BinartyString {

	public int minOperations(String s) {
	      int n = s.length();
	      int miss1 = 0, miss2 =0;

	      for(int i=0;i<n;i++)
	      {
	        char exp1 = (i% 2 ==0)? '0': '1';
	        char exp2 = (i% 2 ==0)? '1': '0';

	          if(s.charAt(i) != exp1) miss1++;
	          if(s.charAt(i) != exp2) miss2++;
	      }
	      return Math.min(miss1, miss2);
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        BinartyString s = new BinartyString();

	        String st = scan.next();

	        int r = s.minOperations(st);

	        System.out.print(r);
	    }

}
