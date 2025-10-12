package arrayprograms;
import java.util.Scanner;
public class SmallerNumber {

	 public int[] smallerNumbersThanCurrent(int[] nums) {
	        
	        int p[] = new int[nums.length];

	        for(int i=0;i<nums.length;i++)
	        {
	            int count = 0;
	            for(int j = 0;j<nums.length;j++)
	            {
	                if(nums[j] < nums[i])
	                {
	                    count++;
	                    p[i] = count;
	                }
	            }
	        }
	        return p;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        SmallerNumber s = new SmallerNumber();

	        int n = scan.nextInt();
	        int[] b = new int[n];
	        for(int j=0;j<n;j++)
	        {
	            b[j] = scan.nextInt();
	        }
	        
	        int[] r = s.smallerNumbersThanCurrent(b);

	        for(int k=0;k< r.length;k++)
	        {
	            System.out.print(r[k]+" ");
	        }
	    }

}
