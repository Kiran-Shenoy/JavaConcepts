package polymorphism;
import java.util.*;
public class Divisor {

	  public int divisorSubstrings(int num, int k) {
	        int count = 0;
	        String s = String.valueOf(num);

	        for(int i=0;i<=s.length()-k;i++)
	        {
	            String sub = s.substring(i,i+k);
	            
	            int val = Integer.parseInt(sub);

	            if(val !=0 && num % val == 0)
	            {
	                count++;
	            }
	        }

	        return count;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Divisor s = new Divisor();

	        int n = scan.nextInt();

	        int k = scan.nextInt();


	        int r = s.divisorSubstrings(n,k);

	        System.out.print(r);
	    }

}
