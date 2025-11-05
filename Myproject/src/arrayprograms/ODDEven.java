package arrayprograms;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ODDEven {

	public int[] sortEvenOdd(int[] nums) {
        List<Integer> evenlist = new ArrayList<>();
        List<Integer> oddlist = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(i %2==0)
            {
                evenlist.add(nums[i]);
            }
            else
            {
                oddlist.add(nums[i]);
            }
        }
        evenlist.sort(null);
        oddlist.sort(Collections.reverseOrder());

        int evenind=0; int oddind =0;
        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i] = evenlist.get(evenind++);
            }
            else
            {
                nums[i]  = oddlist.get(oddind++);
            }
        }

        return nums;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ODDEven s = new ODDEven();

        int n = scan.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int r[]  = s.sortEvenOdd(a);

        for(int k=0;k<r.length;k++)
        {
            System.out.print(r[k]+" ");
        }
    }

}
