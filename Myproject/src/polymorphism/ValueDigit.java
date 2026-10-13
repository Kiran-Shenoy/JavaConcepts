package polymorphism;
import java.util.Scanner;
public class ValueDigit {

	public boolean validDigit(int n, int x) {
        
	       String num  = String.valueOf(n);
	       String digit = String.valueOf(x);

	       boolean contains = num.contains(digit);

	       boolean starts = num.startsWith(digit);

	       return contains && !starts; 
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ValueDigit s = new ValueDigit();

	        int n = scan.nextInt();
	        int x = scan.nextInt();

	        boolean r = s.validDigit(n,x);

	        System.out.print(r);
	    }

}
