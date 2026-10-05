package multiThreading;
import java.util.Scanner;
public class ReachANumber {
	public int reachNumber(int target) {

        target = Math.abs(target);
        int k = 0;
        long sum =0;

        while(sum < target)
        {
            k++;
            sum += k;
        }

        while((sum - target) % 2 != 0)
        {
            k++;
            sum += k ;
        }

        return k;

    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ReachANumber s = new ReachANumber();

        int n = scan.nextInt();

        int  r = s.reachNumber(n);
        System.out.print(r);
    }

}
