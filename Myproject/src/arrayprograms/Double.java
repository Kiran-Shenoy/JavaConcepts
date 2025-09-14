package arrayprograms;
import java.util.Scanner;

public class Double {

	 public boolean checkIfExist(int[] arr) {
		    
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr.length;j++)
	            {
	                if( i!=j && arr[i] == 2*arr[j])
	                {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Double s = new Double();

	        int n = scan.nextInt();
	        int a[] = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        boolean b = s.checkIfExist(a);

	        System.out.print(b);
	    }

}
