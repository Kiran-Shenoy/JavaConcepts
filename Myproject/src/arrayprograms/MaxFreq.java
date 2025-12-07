package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;
public class MaxFreq {

	 public int findLucky(int[] arr) {
	        Arrays.sort(arr);
	        int max=-1;
	        for(int i=0;i<arr.length;)
	        {
	            int count =0;
	            int j=i;
	            while(j<arr.length&& arr[i] == arr[j])
	            {

	              count++;
	              j++;
	            
	            }
	            if(count==arr[i])
	            {
	              max = Math.max(max,arr[i]); 
	            }
	        
	           i=j;
	        }
	        
	        return max;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        MaxFreq s = new MaxFreq();

	        int n =scan.nextInt();
	        int a[]  = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int r = s.findLucky(a);

	        System.out.print(r);
	    }

}
