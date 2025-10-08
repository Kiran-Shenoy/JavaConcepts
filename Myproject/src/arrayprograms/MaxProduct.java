package arrayprograms;
import java.util.Scanner;
public class MaxProduct {

	public int maxProduct(int[] nums) {
	       int max1=Integer.MIN_VALUE;;
	       int max2= Integer.MIN_VALUE;

	       for(int num:nums)
	       {
	        if(num > max1)
	        {
	            max2 = max1;
	            max1= num;
	        }
	        else if(num > max2)
	        {
	            max2 = num;
	        }

	       }
	       int p = (max1-1)*(max2-1);
	       return p;  
	    }
	      public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        MaxProduct s = new MaxProduct();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int b = s.maxProduct(a);

	        System.out.print(b);
	    }

}
