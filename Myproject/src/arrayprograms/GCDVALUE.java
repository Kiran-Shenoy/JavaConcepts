package arrayprograms;
import java.util.Scanner;
import java.math.BigInteger;
public class GCDVALUE {
	 public int findGCD(int[] nums) {
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        for(int num: nums)
	        {
	            max = Math.max(num, max);
	            min = Math.min(num , min);
	        }
	    BigInteger a = BigInteger.valueOf(max);
	    BigInteger b = BigInteger.valueOf(min);
	    BigInteger res = a.gcd(b);
	    return res.intValue();

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        GCDVALUE s = new GCDVALUE();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int r = s.findGCD(a);

	        System.out.print(r);
	    }

}
