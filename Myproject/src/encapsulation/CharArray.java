package encapsulation;
import java.util.*;
public class CharArray {

	 public int minimizedStringLength(String s) {
	        
	        Set<Character>  set = new HashSet<>();
	        for(char ch : s.toCharArray())
	        {
	            set.add(ch);
	        }

	        return set.size();
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        CharArray s = new CharArray();

	        String st = scan.next();

	        int r = s.minimizedStringLength(st);

	        System.out.print(r);
	    }
}
