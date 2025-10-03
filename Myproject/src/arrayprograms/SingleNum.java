package arrayprograms;
import java.util.Scanner;
public class SingleNum {

	public int singleNonDuplicate(int[] nums) {
        int res = 0;
        for(int num : nums)
        {
            res ^= num;

        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        SingleNum s = new SingleNum();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int r = s.singleNonDuplicate(a);

        System.out.print(r);
    }

}
