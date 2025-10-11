package arrayprograms;
import java.util.Scanner;
public class ContainsDuplicate {

	  public boolean containsNearbyDuplicate(int[] nums, int k) {
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<= i+k && j< nums.length;j++)
	            {
	                if(nums[i] == nums[j] && Math.abs(i-j) <=k)
	                {
	                        return true;
	                }
	            }
	        }
	        return false;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ContainsDuplicate s = new ContainsDuplicate();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  = scan.nextInt();
	        }

	        int k = scan.nextInt();
	        boolean b = s.containsNearbyDuplicate(a,k);

	        System.out.print(b);
	    }


}
