package staticConcept;
import java.util.Scanner;
public class PowerOf3 {

public boolean isPowerOfThree(int n) {
        
        if(n<=0)
        {
            return false;
        }
        while(n % 3==0)
        {
            n = n/3;
        }
        return n==1;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        PowerOf3 s = new PowerOf3();

        int n = scan.nextInt();

        boolean r = s.isPowerOfThree(n);

        System.out.print(r);
    }

}
