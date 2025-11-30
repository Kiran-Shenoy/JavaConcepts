package arrayprograms;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
public class DissappearedNumbers {

	  public List<Integer> findDisappearedNumbers(int[] nums) {
	        List<Integer> list = new ArrayList<>();
	        Set<Integer> set = new HashSet<>();

	        for(int num:nums)
	        {
	            set.add(num);
	        }
	        for(int i=1;i<=nums.length;i++)
	        {
	            if(!set.contains(i))
	            {
	                list.add(i);
	            }
	        }
	        return list;
	    }
	   
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        DissappearedNumbers s = new DissappearedNumbers();

	        int n = scan.nextInt();
	        int a[]  = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  = scan.nextInt();
	        }


	        List<Integer> r = s.findDisappearedNumbers(a);

	        System.out.print(r);
	    }

}
