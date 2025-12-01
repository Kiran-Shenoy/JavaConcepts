package arrayprograms;
import java.util.Scanner;

public class PrimeCheck {

	 public long splitArray(int[] nums) {
	        long sum=0;
	        long sum1=0;
	        for(int i=0;i<nums.length;i++)
	        {
	           if(isprime(i))
	           {
	              
	              sum = sum + nums[i];
	           } 
	           else
	           {
	            
	              sum1 = sum1 + nums[i];
	           }
	        }
	        long sss = sum-sum1;
	        return Math.abs(sss);

	    }
	    private boolean isprime(int n)
	    {
	        if(n<=1) return false;
	        if(n == 2) return true;
	        if(n%2==0) return false;

	        for(int i=3;i*i<=n;i=i+2)
	        {
	            if(n%i==0)
	            {
	              return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        PrimeCheck s = new PrimeCheck();

	        int n  =scan.nextInt();
	        int a[]  = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        long r = s.splitArray(a);

	        System.out.print(r);
	    }

}
