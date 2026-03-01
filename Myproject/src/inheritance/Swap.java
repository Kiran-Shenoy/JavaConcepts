package inheritance;
import java.util.Scanner;
public class Swap {

	 public boolean rotateString(String s, String goal) {
	        
	        if(s.length() != goal.length())
	        {
	            return false;
	        }
	         String doubled = s+s;
	         return doubled.contains(goal);
	        
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Swap s = new Swap();

	        String st = scan.next();
	        String goal = scan.next();


	        boolean r = s.rotateString(st,goal);
	        System.out.print(r);
	    }

}
