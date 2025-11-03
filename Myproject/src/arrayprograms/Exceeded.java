package arrayprograms;
import java.util.Scanner;
public class Exceeded {
	public int minOperations(int[] nums, int k) {
        int count =0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] >= k )
            {
               count++;   
            }
        }
        return nums.length - count;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Exceeded s = new Exceeded();

        int n = scan.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int k = scan.nextInt();

        int r = s.minOperations(a,k);

        System.out.print(r);
    }
}
