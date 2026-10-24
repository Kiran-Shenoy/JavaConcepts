package interfaces;
import java.util.*;
public class Pairs {

	 public int countKDifference(int[] nums, int k) {
	        
	        Map<Integer , Integer> map = new HashMap<>();
	        int totalpairs = 0;

	        for(int num : nums)
	        {
	            if(map.containsKey(num - k))
	            {
	                totalpairs += map.get(num-k);
	            }
	            if(map.containsKey(num + k))
	            {
	                totalpairs += map.get(num+k);
	            }

	            map.put(num , map.getOrDefault(num,0)+ 1);
	        }
	        return totalpairs;
	    }

	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Pairs s = new Pairs();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i] = scan.nextInt();
	        }

	        int k = scan.nextInt();

	        int r = s.countKDifference(a,k);

	        System.out.print(r);
	    }

}
