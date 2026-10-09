package inheritance;
import java.util.Scanner;
public class ProdSum {

	public int subtractProductAndSum(int n) {
        
	       int sum=0;
	       int prod = 1;

	       while(n > 0)
	       {
	         int num = n % 10; // extract last digit
	         sum += num;
	         prod *= num;
	         n /= 10;  // remove last digit
	       }

	       return prod - sum;

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ProdSum s = new ProdSum();

	        int n = scan.nextInt();

	        int r = s.subtractProductAndSum(n);

	        System.out.print(r);
	    }

}
