package arrayprograms;
import java.util.Scanner;
public class FirstLatOccurance {

	 public int[] searchRange(int[] nums, int target) {
	        int[] aa = new int[]{-1,-1};

	        for(int i=0;i<nums.length;i++)
	        {
	            if(nums[i] == target)
	            {
	                aa[0] = i;
	                break;
	            }
	        }
	        for(int j=nums.length-1;j>=0;j--)
	        {
	            if(nums[j] == target)
	            {
	               aa[1] = j;
	               break;
	            }
	        }
	        return aa;

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        FirstLatOccurance s = new FirstLatOccurance();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int t = scan.nextInt();

	        int[] r = s.searchRange(a,t);

	        for(int k=0;k<r.length;k++)
	        {
	            System.out.print(r[k]+" ");
	        }
	    }
}
