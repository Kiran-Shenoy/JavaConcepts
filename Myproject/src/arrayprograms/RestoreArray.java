package arrayprograms;
import java.util.Scanner;
public class RestoreArray {

	public int[] recoverOrder(int[] order, int[] friends) {
        int ss[] = new int[friends.length];
        int k=0;
        for(int i=0;i<order.length;i++)
        {
            for(int j=0;j<friends.length;j++)
            {
                if(order[i] == friends[j])
                {
                   ss[k] = order[i];
                   k++;
                }
            }
        }

        return ss;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        RestoreArray s = new RestoreArray();

        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }

        int m = scan.nextInt();
        int a1[] = new int[n];
        for(int j=0;j<m;j++)
        {
            a1[j] = scan.nextInt();
        }
        int[] r = s.recoverOrder(a,a1);

        for(int k=0;k<r.length;k++)
        {
            System.out.print(r[k]+" ");
        }
    }

}
