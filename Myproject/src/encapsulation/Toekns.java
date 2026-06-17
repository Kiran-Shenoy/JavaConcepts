package encapsulation;
import java.util.*;
public class Toekns {

	 public int numDifferentIntegers(String word) {
	        
	        word = word.replaceAll("[a-z]", " ");

	        String[] tokens = word.trim().split("\\s+");

	        Set<String> set = new HashSet<>();

	        for(String token :tokens)
	        {
	            if(!token.isEmpty())
	            {
	              token = token.replaceFirst("^0+","");
	              if(token.isEmpty()) token = "0";
	              set.add(token);
	            }
	        }
	        return set.size();
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Toekns s = new Toekns();

	     String st = scan.next();

	        int r = s.numDifferentIntegers(st);

	        System.out.print(r);
	    }

}
