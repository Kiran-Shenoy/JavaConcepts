package encapsulation;
import java.util.Scanner;
import java.util.*;
public class Origin {
	  public boolean isPathCrossing(String path) {
	        
	        Set<String> visited = new HashSet<>();
	        int x=0 , y=0;
	        visited.add(x + ","+ y);
	        for(char c : path.toCharArray())
	        {
	            if( c == 'N') y++;
	            else if(c == 'S') y--;
	            else if(c == 'E') x++;
	            else if(c == 'W') x--;

	            String pos = x+","+y;
	            if(visited.contains(pos))
	            {
	                return true;
	            }
	            visited.add(pos);
	        }
	        return false;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Origin s = new Origin();

	        String st = scan.next();

	        boolean r = s.isPathCrossing(st);

	        System.out.print(r);
	    }

}
