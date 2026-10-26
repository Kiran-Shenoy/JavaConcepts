package multiThreading;
import java.util.*;
public class ClosestNumber {

	 public List<Integer> findClosestElements(int[] arr, int k, int x) {
	        
	        int left = 0;
	        int right = arr.length-1;

	        while(right - left + 1 > k)
	        {
	            if(Math.abs(arr[left] - x) > Math.abs(arr[right] - x))
	            {
	                left++;
	            }
	            else
	            {
	                right--;
	            }
	        }

	        List<Integer> res = new ArrayList<>();
	        for(int i = left ; i <= right;i++)
	        {
	            res.add(arr[i]);
	        }

	        return res;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ClosestNumber s = new ClosestNumber();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int k = scan.nextInt();
	        int x = scan.nextInt();

	        List<Integer> r = s.findClosestElements(a,k,x);

	        System.out.print(r);
	    }
}
