package inheritance;
import java.util.Scanner;
public class Password {

	 public boolean strongPasswordCheckerII(String password) {
	        
	        if(password.length() < 8) return false;

	        boolean hasLower =false , hasUpper = false, hasDigit = false, hasSpecial = false;
	        String specials = "!@#$%^&*()-+";

	        for(int i=0;i<password.length();i++)
	        {
	            char c = password.charAt(i);
	            if(Character.isLowerCase(c)) hasLower = true;
	            if(Character.isUpperCase(c)) hasUpper = true;
	            if(Character.isDigit(c)) hasDigit = true;
	            if(specials.indexOf(c) != -1) hasSpecial = true;

	            if(i > 0 && password.charAt(i) == password.charAt(i-1)) return false;
	        }
	        return hasLower && hasUpper && hasDigit && hasSpecial;
	    }
	    public static void main(String[] args)
	    {
	        Scanner  scan = new Scanner(System.in);
	        Password s = new Password();

	        String st = scan.next();
	        
	        boolean r = s.strongPasswordCheckerII(st);

	        System.out.print(r);
	        
	    }

}
