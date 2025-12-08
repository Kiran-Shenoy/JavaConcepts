package arrayprograms;
import java.util.Scanner;
public class SumUptoZero {

	 public int[] sumZero(int n) {
	        int[] a = new int[n];
	        int index=0;
	        for(int i=1;i<=n/2;i++)
	        {
	            a[index++] = i;
	            a[index++] = -i;
	        }

	        if(n%2!=0)
	        {
	            a[index++] = 0;
	        }
	        return a;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        SumUptoZero s = new SumUptoZero();

	        int n = scan.nextInt();

	        int[] r = s.sumZero(n);

	        for(int i=0;i<r.length;i++)
	        {
	            System.out.print(r[i]+" ");
	        }
	    }

}
