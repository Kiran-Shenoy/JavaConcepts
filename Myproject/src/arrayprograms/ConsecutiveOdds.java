package arrayprograms;
import java.util.Scanner;
public class ConsecutiveOdds {
	 public boolean threeConsecutiveOdds(int[] arr) {
	        for(int i=0;i<arr.length-2;i++)
	        {
	            if(arr[i] %2!=0 && arr[i+1] %2!=0 && arr[i+2] %2!=0)
	            {
	              return true;
	            }
	        }
	        return false;
	    }

	     public static void main(String[] args)
	    {
	        Scanner scan  = new Scanner(System.in);
	        ConsecutiveOdds s = new ConsecutiveOdds();

	        
	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i = 0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        boolean b = s.threeConsecutiveOdds(a);

	        System.out.print(b);
	    }

}
