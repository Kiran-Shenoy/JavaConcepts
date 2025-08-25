package arrayprograms;
import java.util.Scanner;

public class SingleNumber {

	public int singleNumber(int[] nums) {
	       int result = 0;
	       for(int num : nums)
	       {
	        result ^= num;
	       }
	       return result;
	    }

	    public static void main(String args[])
	    {
	        Scanner scan = new Scanner(System.in);
	        SingleNumber s = new SingleNumber();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]= scan.nextInt();
	        }

	        int res  = s.singleNumber(a);

	        System.out.print(res);
	    }

}
