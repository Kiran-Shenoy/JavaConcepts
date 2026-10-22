package methodOverload;
import java.util.Scanner;
public class Forts {

	public int captureForts(int[] forts) {
        int max = 0;
        int last = -1;

        for(int i=0;i<forts.length;i++)
        {
            if(forts[i] == -1 || forts[i] == 1)
            {
                if(last != -1 && forts[i] != forts[last])
                {
                    max = Math.max(max , i - last-1);
                }
                last = i;
            }
            
        }
        return max;

        

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Forts s = new Forts();

        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = scan.nextInt();
        }


        int r = s.captureForts(a);

        System.out.print(r);
    }
}
