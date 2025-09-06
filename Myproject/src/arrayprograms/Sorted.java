package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;
public class Sorted {
	 public int[] sortedSquares(int[] nums) {
	        int res[] = new int[nums.length];
	        for(int i=0;i<nums.length;i++)
	        {
	            res[i] = nums[i]* nums[i];
	        }
	        Arrays.sort(res);

	        return res;
	    }
	       public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Sorted s = new Sorted();

	    
	        int n = scan.nextInt();
	        int a[]= new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int r[] = s.sortedSquares(a);

	        for(int j = 0;j<r.length;j++)
	        {
	            System.out.print(r[j] + " ");
	        }
	    }



}
