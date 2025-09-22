package arrayprograms;
import java.util.Scanner;
public class Mod {
	  public int smallestEqual(int[] nums) {
	        for(int i=0;i<nums.length;i++)
	        {
	            if(i % 10 == nums[i])
	            {
	                return nums[i];
	            }
	          
	        }
	        return -1;
	    }
	     public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Mod s = new Mod();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  = scan.nextInt();
	        }

	        int r = s.smallestEqual(a);
	        System.out.print(r);
	    }

}
