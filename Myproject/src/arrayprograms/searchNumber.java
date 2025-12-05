package arrayprograms;
import java.util.Scanner;

public class searchNumber {

	 public boolean search(int[] nums, int target) {
	        
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
	        searchNumber s = new searchNumber();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int target = scan.nextInt();

	        boolean r = s.search(a,target);

	        System.out.print(r);
	    }
}
