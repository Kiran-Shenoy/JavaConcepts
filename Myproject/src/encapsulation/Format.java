package encapsulation;
import java.util.Scanner;
public class Format {

	  public boolean haveConflict(String[] event1, String[] event2) {
	        

	        return event1[0].compareTo(event2[1]) <= 0 
	        && event2[0].compareTo(event1[1])  <= 0;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Format s = new Format();

	        String st1[] = new String[2];
	        for(int i=0;i<2;i++)
	        {
	            st1[i] = scan.next();
	        }

	        String st2[] = new String[2];
	        for(int j=0;j<2;j++)
	        {
	            st2[j] = scan.next();
	        }

	        boolean r = s.haveConflict(st1,st2);

	        System.out.print(r);
	    }

}
