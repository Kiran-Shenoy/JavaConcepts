package arrayprograms;
import java.util.Scanner;
public class Sum11 {

public boolean canAliceWin(int[] nums) {
        
        int sum=0;
        int sum1=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] < 10)
            {
                sum = sum+nums[i];
            }
            else
            {
                sum1 = sum1+nums[i];
            }
        }
        if(sum == sum1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Sum11 s = new Sum11();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();

        }


        boolean r = s.canAliceWin(a);

        System.out.print(r);
    }

}
