package interfaces;
import java.util.Scanner;
public class SUMOF {

	  public boolean judgeSquareSum(int c) {
		  
	      long a = 0;
	      long b = (long) Math.sqrt(c);
	      while(a<=b)
	      {
	         long sum = a*a + b*b;
	         if(sum == c)
	         {
	            return true;
	         }
	         else if( sum > c)
	         {
	            b--;
	         }
	         else if(sum < c)
	         {
	            a++;
	         }
	      }
	      return false;
	          
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        SUMOF s = new SUMOF();

	        int n = scan.nextInt();

	        boolean r = s.judgeSquareSum(n);

	        System.out.print(r);
	    }

}
