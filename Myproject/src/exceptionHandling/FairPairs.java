package exceptionHandling;
import java.util.*;
public class FairPairs {

	 public long countFairPairs(int[] nums, int lower, int upper) {
	      Arrays.sort(nums);
	       
	       return countLessOrEqual(nums,upper) - countLessOrEqual(nums, lower -1);
	    }
	    private long countLessOrEqual(int[] nums, int target)
	    {
	        long count=0;
	        int left =0;
	        int right = nums.length -1;

	        while(left < right)
	        {
	            if(nums[left] + nums[right] <= target)
	            {
	                count += (right -  left);
	                left++;
	            }
	            else
	            {
	                right--;
	            }
	        }
	        return count;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        FairPairs s = new FairPairs();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]= scan.nextInt();
	        }

	        int l = scan.nextInt();
	        int u = scan.nextInt();

	        long r = s.countFairPairs(a,l,u);

	        System.out.print(r);
	    }

}
