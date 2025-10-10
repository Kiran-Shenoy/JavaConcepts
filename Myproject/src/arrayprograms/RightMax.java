package arrayprograms;
import java.util.Scanner;
public class RightMax {

	 public int[] replaceElements(int[] arr) {
	        int m[] = new int[arr.length];
	        
	        for(int i=0;i<arr.length-1;i++)
	        {
	            int max = Integer.MIN_VALUE;
	            for(int j=i+1;j<arr.length;j++)
	            {
	                if(arr[j] > max)
	                {
	                    max = arr[j];
	                    m[i] = max;
	                }
	            }
	        }
	        m[m.length-1] = -1;
	        return m;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        RightMax s = new RightMax();

	        int n = scan.nextInt();
	        int a[]= new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int r[] = s.replaceElements(a);
	        for(int i=0;i<r.length;i++)
	        {
	            System.out.print(r[i]+" ");
	        }


	    }

}
