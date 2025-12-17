package arrayprograms;
import java.util.Scanner;
public class OrderedTriplet {

public long maximumTripletValue(int[] nums) {
        
        long maxval=0;

        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    long val = ((long)nums[i]-nums[j])*nums[k];
                    maxval = Math.max(maxval,val);
                }
            }
        }

        return maxval;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        OrderedTriplet s = new OrderedTriplet();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        long r = s.maximumTripletValue(a);

        System.out.print(r);
    }

}
