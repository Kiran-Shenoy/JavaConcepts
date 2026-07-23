package encapsulation;
import java.util.Scanner;
public class PerfectSquare {

	 public boolean isPerfectSquare(int num) {
	     
	       if(num < 1) return false;

	       long left =1;
	       long right = num;

	        while(left <= right)
	        {
	            long mid = left + (right - left)/2;
	            long square = mid* mid;

	            if(square == num)
	            {
	                return true;
	            }
	            else if(square > num)
	            {
	                right = mid -1;
	            }
	            else
	            {
	                left = mid +1;
	            }
	        }
	        return false;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        PerfectSquare s = new PerfectSquare();

	        int n = scan.nextInt();

	        boolean r = s.isPerfectSquare(n);

	        System.out.print(r);
	    }
}
