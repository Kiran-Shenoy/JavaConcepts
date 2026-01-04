package staticConcept;
import java.util.Scanner;
public class TrailingZeroes {

	public int zero(int n)
	{
		int res=0;
		int pow = 5;
		while(n>=pow)
		{
			res = res + (n/pow);
			pow = pow*5;
		}
		return res;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	        Scanner scan = new Scanner(System.in);
	        TrailingZeroes s = new TrailingZeroes();

	        int n = scan.nextInt();

	        int r = s.zero(n);

	        System.out.print(r);
	    }
}
