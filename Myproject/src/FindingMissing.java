import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
public class FindingMissing {

	 public List<Integer> findMissingElements(int[] nums) {
	        List<Integer> list = new ArrayList<>();

	        Arrays.sort(nums);
	        int min  = nums[0];
	        int max = nums[nums.length-1];

	        for(int i=min;i<=max;i++)
	        {
	           if(!contains(nums,i))
	           {
	                list.add(i);
	           }
	        } 
	        return list;

	      
	    }
	      private boolean contains(int[] nums, int target)
	        {
	            for(int num:nums)
	            {
	                if(num == target)
	                {
	                    return true;
	                }
	            }
	            return false;
	        }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        FindingMissing s = new FindingMissing();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  = scan.nextInt();
	        }

	        List<Integer> r  = s.findMissingElements(a);

	        System.out.print(r);
	    }

}
