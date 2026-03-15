package aggregateComposite;
import java.util.Scanner;
public class Indexx {

	 public int jump(int[] nums) {
	        int jumps=0 , current = 0, farthest = 0;
	        for(int i=0;i<nums.length-1; i++)
	        {
	            farthest = Math.max(farthest, i + nums[i]);
	            if(i == current)
	            {
	                jumps++;
	                current = farthest;
	            }
	        }

	     return jumps;
	    }
	       public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Indexx s = new Indexx();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	       

	        int r = s.jump(a);
	        System.out.print(r);

	    }

}
