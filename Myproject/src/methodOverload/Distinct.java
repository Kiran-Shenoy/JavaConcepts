package methodOverload;
import java.util.Scanner;
import java.util.*;
public class Distinct {

	 public int distinctAverages(int[] nums) {
	        
	        Arrays.sort(nums);
	        Set<Double> averages = new HashSet<>();

	        int left =0;
	        int right = nums.length - 1;

	        while(left < right)
	        {
	           double ans = (double)(nums[left] + nums[right])/ 2.0;

	           averages.add(ans);

	           left++;
	           right--;
	        }

	        return averages.size();
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Distinct s = new Distinct();

	        int n = scan.nextInt();

	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] =  scan.nextInt();
	        }


	        int r = s.distinctAverages(a);

	        System.out.print(r);
	    }

}
