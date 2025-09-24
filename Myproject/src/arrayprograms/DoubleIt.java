package arrayprograms;
import java.util.Scanner;
public class DoubleIt {

	    public int findFinalValue(int[] nums, int original) {
	     
	     for(int i=0;i<nums.length;i++)
	     {
	        if(nums[i] == original)
	        {
	            original = 2* original;
	            i=-1;
	        }
	     }  
	     return original; 
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        DoubleIt s = new DoubleIt();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int k = scan.nextInt();
	        int r = s.findFinalValue(a,k);

	        System.out.print(r);
	        
	   
	}
}
