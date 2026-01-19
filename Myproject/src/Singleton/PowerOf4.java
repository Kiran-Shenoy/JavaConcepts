package Singleton;
import java.util.Scanner;
public class PowerOf4 {

	 public boolean isPowerOfFour(int n) {
	        
	        if(n<=0) return false;
	        while(n%4==0)
	        {
	            n /= 4;

	        }

	        return n==1;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        PowerOf4 s = new PowerOf4();

	        int n = scan.nextInt();
	        
	        boolean r = s.isPowerOfFour(n);

	        System.out.print(r);
	    }

}
