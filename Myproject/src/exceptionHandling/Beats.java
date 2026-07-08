package exceptionHandling;
import java.util.Scanner;
public class Beats {

    public boolean divisorGame(int n) {
        
        return n % 2== 0;
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Beats s = new Beats();

        int n = scan.nextInt();

        boolean r = s.divisorGame(n);

        System.out.print(r);
    }

}
