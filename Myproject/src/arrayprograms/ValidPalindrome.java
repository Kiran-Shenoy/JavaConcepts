package arrayprograms;
import java.util.Scanner;
public class ValidPalindrome {

	 public boolean isPalindrome(String s) {
	      
	       int i=0;
	       int j=s.length()-1;
	       while(i<j)
	       {
	          while(i<j && !Character.isLetterOrDigit(s.charAt(i)))
	          {
	            i++;
	          }
	          while(i<j && !Character.isLetterOrDigit(s.charAt(j)))
	          {
	            j--;
	          }
	           if( Character.toLowerCase(s.charAt(i)) !=  Character.toLowerCase(s.charAt(j)))
	           {
	              return false;
	           }
	           i++;
	           j--;
	          
	       }
	       return true;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ValidPalindrome s = new ValidPalindrome();

	        String st = scan.nextLine();

	        boolean r = s.isPalindrome(st);

	        System.out.print(r);
	    }

}
