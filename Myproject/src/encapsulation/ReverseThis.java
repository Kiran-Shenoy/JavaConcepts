package encapsulation;
import java.util.Scanner;
public class ReverseThis {

	 public String reversePrefix(String s, int k) {
	        String firstpart = s.substring(0,k);
	        StringBuilder sb = new StringBuilder(firstpart);
	        sb.reverse();

	        return sb.toString() + s.substring(k);
	    }
	      public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ReverseThis s = new ReverseThis();

	        String m = scan.next();
	        int n = scan.nextInt();

	        String r = s.reversePrefix(m,n);

	        System.out.print(r);
	    }

}
