package aggregateComposite;
import java.util.*;
public class Colors {

	 public boolean winnerOfGame(String colors) {
	        int alice = 0;
	        int bob =0;
	        for(int i=1;i<colors.length()-1;i++)
	        {
	          if(colors.charAt(i) == 'A' && colors.charAt(i-1) == 'A' && colors.charAt(i+1) == 'A')
	          {
	              alice++;
	          }
	          else if(colors.charAt(i) == 'B' && colors.charAt(i-1) == 'B' && colors.charAt(i+1) == 'B')
	          {
	              bob++;
	          }
	        }
	       return alice > bob;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Colors s = new Colors();

	        String st = scan.next();

	        boolean r = s.winnerOfGame(st);

	        System.out.print(r);
	    }

}
