package arrayprograms;
import java.util.Scanner;
public class BestDevisor {
	public int maxDivScore(int[] nums, int[] divisors) {
        
	       int bestDivisor = Integer.MAX_VALUE;
	        int max= 0;
	        for(int i=0;i< divisors.length;i++)
	        {
	             int count =0;
	            for(int j=0;j<nums.length;j++)
	            {
	                if(nums[j] % divisors[i] == 0)
	                {
	                    count++;
	                
	                }
	            }
	            if(count>max || (count ==max && divisors[i] < bestDivisor))
	            {
	                max = count;
	                bestDivisor = divisors[i];
	            }
	        }
	        return bestDivisor;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        BestDevisor s = new BestDevisor();

	        int n = scan.nextInt();
	        int a1[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a1[i] = scan.nextInt();
	        }


	        int m = scan.nextInt();
	        int a2[] = new int[m];
	        for(int j=0;j<m;j++)
	        {
	            a2[j] = scan.nextInt();
	        }

	        int r = s.maxDivScore(a1,a2);

	        System.out.print(r);
	    }

}
