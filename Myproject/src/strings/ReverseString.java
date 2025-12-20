package strings;
import java.util.Scanner;
public class ReverseString {

	  public String reverseOnlyLetters(String s) {
	        char[] ch = s.toCharArray();
	        int i=0,j=ch.length-1;
	        while(i<j)
	        {
	            if(!Character.isLetter(ch[i]))
	            {
	                i++;
	            }
	            else if(!Character.isLetter(ch[j]))
	            {
	                j--;
	            }
	            else
	            {
	                char temp = ch[i];
	                ch[i] = ch[j];
	                ch[j] = temp;
	                i++;
	                j--;
	            }
	        }

	        return new String(ch);
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ReverseString s = new ReverseString();

	        int n = scan.nextInt();
	        String st = scan.next();

	        String r = s.reverseOnlyLetters(st);

	        System.out.print(r);
	    }

}
