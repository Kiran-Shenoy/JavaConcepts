package arrayprograms;
import java.util.Scanner;
public class Target {
	 public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
	        int count=0;

	        for(int i=0;i<hours.length;i++)
	        {
	            if(hours[i] >= target)
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Target s = new Target();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]= scan.nextInt();

	        }
	        int k = scan.nextInt();
	        int r = s.numberOfEmployeesWhoMetTarget(a,k);

	        System.out.print(r);
	    }

}
