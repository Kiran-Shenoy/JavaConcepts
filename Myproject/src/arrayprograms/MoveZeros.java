package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;

public class MoveZeros {

	
	    public void moveZeroes(int[] nums) {
	        int i=0, j=0;
	        while(i<nums.length)
	        {
	            if(nums[i] == 0)
	            {
	                i++;
	            }
	            else
	            {
	                nums[j] = nums[i];
	                j++;
	                i++;
	            }
	        }

	        while(j<nums.length)
	        {
	            nums[j] = 0;
	            j++;
	        }
	        
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        MoveZeros s = new MoveZeros();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i< n;i++)
	        {
	            a[i] = scan.nextInt();
	        } 

	       s.moveZeroes(a);

	        System.out.print(Arrays.toString(a));
	        
	    }


}
