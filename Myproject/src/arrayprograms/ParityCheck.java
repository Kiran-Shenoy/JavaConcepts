package arrayprograms;
import java.util.Scanner;
public class ParityCheck {
	 public int[] sortArrayByParityII(int[] nums) {
	        int res[] = new int[nums.length];
	        int even = 0;
	        int odd = 1;
	        for(int num : nums)
	        {
	            if(num%2 == 0)
	            {
	                res[even] = num;
	                even = even +2;

	            }
	            else
	            {
	                res[odd] = num;
	                odd = odd+2;
	            }
	        }
	        return res;
	    }

	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ParityCheck s = new ParityCheck();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int[] r = s.sortArrayByParityII(a);

	        for(int j = 0;j<r.length;j++)
	        {
	            System.out.print(r[j]+" ");
	        }

	    
	}

}
