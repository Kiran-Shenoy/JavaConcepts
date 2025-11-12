package arrayprograms;
import java.util.Scanner;
public class Atleast {

	 public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
	        int count=0;
	        for(int i=0;i<arr1.length;i++)
	        {
	            boolean isvalue = true;
	            for(int j=0;j<arr2.length;j++)
	            {
	                if(Math.abs(arr1[i]-arr2[j]) <=d)
	                {
	                    isvalue = false;
	                    break;
	                }
	            }

	            if(isvalue)
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Atleast s = new Atleast();

	        int n = scan.nextInt();
	        int a1[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a1[i] =scan.nextInt();
	        }
	          int m = scan.nextInt();
	        int a2[] = new int[m];
	        for(int j=0;j<m;j++)
	        {
	            a2[j] =scan.nextInt();
	        }

	        int d = scan.nextInt();
	        int r = s.findTheDistanceValue(a1,a2,d);
	    }

}
