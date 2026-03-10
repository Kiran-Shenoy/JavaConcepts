package inheritance;
import java.util.Scanner;
public class AABB {

	 public boolean checkString(String s) {
	        
	        boolean seenB = false;
	        for(char ch : s.toCharArray())
	        {
	            if(ch == 'b')
	            {
	                seenB = true;
	            }
	            else if(ch == 'a' && seenB)
	            {
	                return false;
	            }
	        }
	        return true;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        AABB s = new AABB();

	        String st = scan.next();

	        boolean r = s.checkString(st);

	        System.out.print(r);
	    }

}
