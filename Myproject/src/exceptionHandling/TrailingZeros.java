package exceptionHandling;
import java.util.Scanner;
public class TrailingZeros {

	  public String removeTrailingZeros(String num) {
		    
		     for(int i= num.length()-1;i >=0;i--)
		     {
		         if(num.charAt(i) != '0')
		         {
		             return num.substring(0 , i+1);
		         }
		     }   
		     return "";

		    }
		    public static void main(String[] args)
		    {
		        Scanner scan = new Scanner(System.in);
		        TrailingZeros s = new TrailingZeros();

		        String st = scan.next();

		        String r = s.removeTrailingZeros(st);

		        System.out.print(r);
		    }

}
