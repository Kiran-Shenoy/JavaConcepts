package exceptionHandling;
import java.util.Scanner;
public class LongPress {

	 public boolean isLongPressedName(String name, String typed) {
	        
	        int i=0;
	        int j=0;
	        while(j < typed.length())
	        {
	            if(i<name.length() && name.charAt(i) == typed.charAt(j))
	            {
	                i++;
	                j++;
	            }
	            else if(j > 0 && typed.charAt(j) == typed.charAt(j-1))
	            {
	                j++;
	            }
	            else
	            {
	                return false;
	            }
	        }
	        return i == name.length();
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        LongPress s = new LongPress();

	        String st1 = scan.next();
	        String st2 = scan.next();

	        boolean r = s.isLongPressedName(st1,st2);

	        System.out.print(r);
	    }

}
