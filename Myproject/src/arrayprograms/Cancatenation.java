package arrayprograms;
import java.util.Scanner;
public class Cancatenation {

	  public int[] getConcatenation(int[] nums) {
	        int ans[] = new int[2*nums.length];
	        for(int i=0;i<nums.length;i++)
	        {
	            ans[i] = nums[i];
	            ans[i+ nums.length] = nums[i];
	        }
	        return ans;
	    }

	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Cancatenation s = new Cancatenation();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int r[] = s.getConcatenation(a);

	        for(int k=0;k<r.length;k++)
	        {
	            System.out.print(r[k]+" ");
	        }
	    }
}
