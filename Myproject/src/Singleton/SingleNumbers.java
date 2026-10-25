package Singleton;
import java.util.Scanner;
public class SingleNumbers {

public int[] singleNumber(int[] nums) {
        
        int xor_all = 0;
        for(int num : nums)
        {
            xor_all ^= num;
        }

        int diff = xor_all & -xor_all;

        int a = 0;
        int b = 0;
        for(int num : nums)
        {
            if((num & diff) !=0)
            {
                a ^= num;
            }
            else
            {
                b ^= num;
            }
        }
        return new int[] {a,b};


    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        SingleNumbers s = new SingleNumbers();

        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int[] r = s.singleNumber(a);

        for(int i=0;i<r.length;i++)
        {
            System.out.print(r[i]+" ");
        }

    }

}
