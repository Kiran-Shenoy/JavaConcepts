package encapsulation;
import java.util.Scanner;
public class PrimeArrangement {

	public int numPrimeArrangements(int n) {
        int countPrime = 0;
        for(int i =1;i<=n;i++)
        {
            if(isPrime(i))
            {
                countPrime++;
            }
        }
       int NP = n - countPrime;
       long MOD = 1_000_000_007;
       
       long result = 1;
       for(int i=1;i<=countPrime;i++)
       {
         result = (result *i) % MOD;
       }
       for(int i=1;i<=NP;i++)
       {
         result = (result * i) % MOD;
       }
       return (int) result;
    }
    private boolean isPrime(int n)
    {
        if(n <=1) return false;
        if(n ==2) return true;
        if(n %2 == 0) return false;

        for(int i=3;i * i <= n;i = i+2)
        {
            if(n %i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        PrimeArrangement s = new PrimeArrangement();

        int n = scan.nextInt();

        int r = s.numPrimeArrangements(n);

        System.out.print(r);
    }

}
