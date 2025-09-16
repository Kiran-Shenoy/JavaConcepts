package arrayprograms;
import java.util.Scanner;
public class NegativeInteger {
	 public int arraySign(int[] nums) {
		    int count =0;
		    for(int i=0;i<nums.length;i++)
		    {
		      if(nums[i] == 0)
		      {
		        return 0;
		      }

		      if(nums[i] < 0)
		      {
		        count++;
		      }

		    }

		    if(count%2 == 0)
		    {
		        return 1;
		    }
		    else
		    {
		        return -1;
		    }
		}

		    public static void main(String[] args)
		    {
		        Scanner scan = new Scanner(System.in);
		        NegativeInteger s = new NegativeInteger();

		        int n = scan.nextInt();
		        int a[] = new int[n];
		        for(int i=0;i<n;i++)
		        {
		            a[i] = scan.nextInt();
		        }

		        int r = s.arraySign(a);

		        System.out.print(r);
		    }
}
