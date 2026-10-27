package polymorphism;
import java.util.*;
public class Boats {

	 public int numRescueBoats(int[] people, int limit) {
	        Arrays.sort(people);
	        int boats = 0;

	        int left = 0;
	        int right  = people.length - 1;

	        while(left <= right)
	        {
	            if(people[left] + people[right] <= limit)
	            {
	                left++;
	                right--;
	            }
	            else
	            {
	                right--;
	            }
	            boats++;
	        }

	        return boats;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Boats s = new Boats();

	        int n = scan.nextInt();
	        int[] a = new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]  = scan.nextInt();
	        }

	        int limit = scan.nextInt();

	        int r = s.numRescueBoats(a,limit);

	        System.out.print(r);
	    }

}
