package arrayprograms;
import java.util.*;
public class DigiSum {

	public int differenceOfSum(int[] nums) {
        int sum = 0;
        int digisum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum +nums[i];
            int t = nums[i];
            while(t > 0 )
            {
            digisum += t %10;
            t/=10;
            }
        }
        int diff = sum - digisum;
        return diff;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DigiSum s = new DigiSum();
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();

        }

        int r = s.differenceOfSum(a);

        System.out.print(r);
    }


}
