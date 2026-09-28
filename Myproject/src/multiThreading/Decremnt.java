package multiThreading;
import java.util.Scanner;
public class Decremnt {

	 public int minMoves(int[] nums) {
	        
	        if(nums == null || nums.length <=1)
	        {
	            return 0;
	        }

	        int minVal = nums[0];
	        for(int num : nums)
	        {
	            if(num < minVal)
	            {
	                minVal = num;
	            }
	        }
	        int moves =0;
	        for(int num:nums)
	        {
	            moves += num- minVal;
	        }
	       return moves;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Decremnt s = new Decremnt();

	        int n = scan.nextInt();
	        int[] ar  = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            ar[i] = scan.nextInt();
	        }

	        int r = s.minMoves(ar);

	        System.out.print(r);
	    }

}
