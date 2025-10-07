package arrayprograms;
import java.util.*;
public class Monotomic {

	public boolean isMonotonic(int[] nums) {
        boolean in = true;
        boolean dec = true;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > nums[i-1])
            {
                dec = false;
            }
            
            if(nums[i] < nums[i-1])
            {
                in = false;
            }
        }

        return in || dec;
    }
    public static void main(String[] arga)
    {
        Scanner scan = new Scanner(System.in);
        Monotomic s = new Monotomic();

        int n= scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        boolean r = s.isMonotonic(a);

        System.out.print(r);
    }

}
