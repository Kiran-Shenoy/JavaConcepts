package arrayprograms;
import java.util.Scanner;
public class Dominant {
	 public int dominantIndex(int[] nums) {
	        int max = Integer.MIN_VALUE;
	        int index = 0 ;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i] > max)
	            {
	                
	                max = nums[i];
	               index = i;
	              
	            }
	        }
	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i] != max && max<2*nums[i])
	            {
	                return -1;
	            }
	        }
	        return index;
	      
	    
	    }


	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Dominant s = new Dominant();
	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }


	        int r = s.dominantIndex(a);

	        System.out.print(r);
	    }
	

}
