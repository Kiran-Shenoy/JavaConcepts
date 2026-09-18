package multiThreading;
import java.util.*;
public class SumFOlder {

	 public int getSum(int a, int b) {
	        
	        while(b != 0 )
	        {
	            int carry = (a & b) << 1;
	            a = a ^ b;
	            b = carry;
	        }

	        return a;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        SumFOlder s = new SumFOlder();

	        int n1 = scan.nextInt();
	        int n2 = scan.nextInt();

	        int r = s.getSum(n1,n2);

	        System.out.print(r);
	    }

}
