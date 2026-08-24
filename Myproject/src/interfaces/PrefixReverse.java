package interfaces;
import java.util.*;
public class PrefixReverse {

	public String reversePrefix(String word, char ch) {
	       
	       int index = word.indexOf(ch);
	       if(index == -1) return word;

	       StringBuilder sb = new StringBuilder(word.substring(0,index+1));

	       sb.reverse();
	       sb.append(word.substring(index+1));

	       return sb.toString();
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        PrefixReverse s = new PrefixReverse();

	        String st = scan.next();

	        char c = scan.next().charAt(0);

	        String r = s.reversePrefix(st,c);

	        System.out.print(r);
	    }

}
