package arrayprograms;
import java.util.Scanner;
public class RunningSum {
	 public int[] runningSum(int[] nums) {
	        int res[] = new int[nums.length];
	        int sum = 0;
	        for(int i=0;i<res.length;i++)
	        {
	           sum = sum+ nums[i];
	           res[i] = sum;
	        }
	        return res;
	    }
	     public static void main(String[] args)
	    {
	        Scanner scan  = new Scanner(System.in);
	        RunningSum s = new RunningSum();

	    
	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i = 0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int r[] = s.runningSum(a);

	        for(int j =0 ;j<r.length;j++)
	        {
	            System.out.print(r[j]+" ");
	        }
	    }
	
}
