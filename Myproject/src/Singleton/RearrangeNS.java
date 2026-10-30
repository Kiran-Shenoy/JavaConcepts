package Singleton;
import java.util.*;
public class RearrangeNS {

	  public int[] rearrangeArray(int[] nums) {
	        
	        int n = nums.length;
	        int[] res = new int[n];

	        int even = 0;
	        int odd = 1;

	        for(int i=0;i<n;i++)
	        {
	            if(nums[i] > 0)
	            {
	                res[even] = nums[i];
	                even += 2;
	            }
	            else
	            {
	                res[odd] = nums[i];
	                odd += 2;
	            }
	        }
	        return res;

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        RearrangeNS s = new RearrangeNS();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int[] r = s.rearrangeArray(a);

	        for(int i=0;i<r.length;i++)
	        {
	            System.out.print(r[i]+" ");
	        }
	    }
}
