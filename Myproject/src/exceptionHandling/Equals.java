package exceptionHandling;
import java.util.Scanner;
public class Equals {

	public boolean isBalanced(String num) {
	       int even =0;
	       int odd = 0;
	       for(int i=0;i<num.length();i++)
	       {
	         int digit = num.charAt(i) - '0';
	         if(i%2==0)
	         {
	            even = even + digit;
	         }
	         else
	         {
	            odd = odd + digit;
	         }
	       } 
	       if(even== odd)
	       {
	         return true;
	       }
	       else
	       {
	         return false;
	       }
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Equals s = new Equals();

	        String st = scan.next();

	        boolean r = s.isBalanced(st);

	        System.out.print(r);
	    }
}
