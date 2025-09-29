package arrayprograms;
import java.util.*;
public class MinOrMax {

	 public int findNonMinOrMax(int[] nums) {
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        int n  = 0;
	        for(int num : nums)
	        {
	            max = Math.max(num , max);
	            min = Math.min(num , min);

	        }
	        for(int i = 0;i<nums.length;i++)
	        {
	            if(nums[i] != max && nums[i] != min)
	            {
	                n = nums[i];
	                return n;
	            }
	            
	        }
	        return -1;
	    }
	    public static void main(String[]  args)
	    {
	        Scanner scan = new Scanner(System.in);
	        MinOrMax s = new MinOrMax();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  =scan.nextInt();
	        }

	        int  r = s.findNonMinOrMax(a);
	        System.out.print(r);
	    }

}
