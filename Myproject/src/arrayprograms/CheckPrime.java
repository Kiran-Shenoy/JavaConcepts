package arrayprograms;
import java.util.Scanner;
import java.util.Arrays;
public class CheckPrime {

    public int countPrimes(int n) {
        if(n<=1)
        {
            return 0;
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2;i*i<n;i++)
        {
            if(isPrime[i]){
                for(int j=i*i;j<n;j += i){
                    isPrime[j] = false;
                }
            }
        }
        int count=0;
        for(int i=1;i<n;i++)
        {
            if(isPrime[i])
            {
                count++;
            }
        }
        return count;
    }
   


    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        CheckPrime s = new CheckPrime();

        int n =scan.nextInt();

        int r = s.countPrimes(n);

        System.out.print(r);
    }
}
