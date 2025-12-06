package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;
public class RotatedAr {

	public int findMin(int[] nums) {
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++)
        {
            return nums[i];
        }
        return -1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        RotatedAr s = new RotatedAr();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int r = s.findMin(a);

        System.out.print(r);
    }

}
