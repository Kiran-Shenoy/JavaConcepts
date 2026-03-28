package interfaces;
import java.util.Scanner;
public class UpperCase {

	  public boolean detectCapitalUse(String word) {
	        
	       if(word.equals(word.toUpperCase())) return true;

	       if(word.equals(word.toLowerCase())) return true;

	       if(Character.isUpperCase(word.charAt(0)) && 
	         word.substring(1).equals(word.substring(1).toLowerCase()))
	        {
	            return true;
	        }
	       return false;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        UpperCase s = new UpperCase();

	        String st = scan.next();

	        boolean r = s.detectCapitalUse(st);

	        System.out.print(r);
	    }
}
