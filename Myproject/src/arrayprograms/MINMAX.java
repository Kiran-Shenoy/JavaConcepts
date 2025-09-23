package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;
public class MINMAX {
	public int countElements(int[] nums) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums)
        {
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        int count = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > min && nums[i]< max)
            {
            count++;
            }
        }
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        MINMAX s = new MINMAX();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]  = scan.nextInt();
        }

        int r = s.countElements(a);
        System.out.print(r);
    }

}
