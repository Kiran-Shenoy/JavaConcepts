package interfaces;
import java.util.Scanner;
public class Remove {

	 public String removeDigit(String number, char digit) {
	        
	      int last =-1;
	      int n = number.length();

	      for(int i=0;i<n;i++)
	      {
	        if(number.charAt(i) == digit)
	        {
	            last = i;

	            if(i+1 <n && number.charAt(i+ 1) > digit)
	            {
	                return number.substring(0,i) + number.substring(i+1);
	            }
	        }
	      }
	      return number.substring(0,last) + number.substring(last+1);
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Remove s = new Remove();

	        String st = scan.next();
	        char ch = scan.next().charAt(0);

	        String r = s.removeDigit(st,ch);


	         System.out.print(r);
	    }
	

}
