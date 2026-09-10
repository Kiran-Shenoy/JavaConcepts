package methodOverload;
import java.util.*;
public class Tribonacci {

public int tribonacci(int n) {
        
        if(n == 0) return 0;
        if(n==1|| n==2)
        {
            return 1;
        }
        
        int a=0,b=1,c=1;
        for(int i=3;i<=n;i++)
        {
            int d = a+b+c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Tribonacci s = new Tribonacci();

        int n = scan.nextInt();

        int r = s.tribonacci(n);

        System.out.print(r);
    }

}
