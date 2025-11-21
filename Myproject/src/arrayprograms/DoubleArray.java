package arrayprograms;
import java.util.Scanner;
public class DoubleArray {

	public int[] shuffle(int[] nums, int n) {
        int[] ss = new int[nums.length];
        for(int i=0;i<n;i++)
        {
           ss[2*i] = nums[i];
           ss[2*i+1] = nums[i+n];
        }
        return ss;


    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        DoubleArray s = new DoubleArray();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }


        int l  = scan.nextInt();

        int[] r  =s.shuffle(a,l);

        for(int k=0;k<r.length;k++)
        {
            System.out.print(r[k]+" ");
        }
    }

}
