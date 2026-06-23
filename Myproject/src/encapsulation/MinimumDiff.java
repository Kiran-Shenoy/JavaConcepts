package encapsulation;
import java.util.*;
public class MinimumDiff {

	  public int minLengthAfterRemovals(String s) {
	        int ap=0,bp=0;
	        for(char ch : s.toCharArray())
	        {
	            if(ch == 'a')
	            {
	                ap++;
	            }
	            else
	            {
	                bp++;
	            }
	        }
	        return Math.abs(ap-bp);
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        MinimumDiff s = new MinimumDiff();

	        String st = scan.next();

	        int r = s.minLengthAfterRemovals(st);

	        System.out.print(r);
	    }
}
