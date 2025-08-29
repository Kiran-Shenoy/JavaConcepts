package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;

public class MajorityElement {
	   public int majorityElement(int[] nums) {
	        Arrays.sort(nums);
	      
	      return nums[nums.length/2];
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        MajorityElement s = new MajorityElement();
	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int res = s.majorityElement(a);
	 
	         System.out.print(res);

	    }
}
