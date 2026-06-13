package interfaces;
import java.util.Scanner;
public class IndexPart {

	 public String removeOccurrences(String s, String part) {
	        
	      StringBuilder sb = new StringBuilder(s);
	      int index = sb.indexOf(part);

	      while(index != -1)
	      {
	         sb.delete(index , index + part.length());

	         index = sb.indexOf(part);
	      }

	      return sb.toString();

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        IndexPart s = new IndexPart();

	        String st = scan.next();
	        String part = scan.next();

	        String res = s.removeOccurrences(st,part);

	        System.out.print(res);
	    }
}
