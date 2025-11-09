package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;
public class Sort {
	public int addedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int x = nums2[0] - nums1[0];
        for(int i=1;i<nums1.length;i++)
        {
           if(nums2[i] - nums1[i] != x)
           {
            return -1;
           }
        }
        return x;
    }
    public static void main(String[] args)
    {
        Scanner scan  = new Scanner(System.in);
        Sort s = new Sort();

        int n = scan.nextInt();
        int a1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a1[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int a2[] = new int[m];
        for(int j=0;j<m;j++)
        {
            a2[j] = scan.nextInt();
        }

        int r = s.addedInteger(a1,a2);

        System.out.print(r);
    }

}
