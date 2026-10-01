package exceptionHandling;
import java.util.*;
public class Jug {

	  public boolean canMeasureWater(int x, int y, int target) {
	        
	        if(x + y < target)
	        {
	            return false;
	        }

	        if(target == 0)
	        {
	            return true;
	        }
	        return target % gcd(x,y) == 0;
	    }
	    private int gcd(int a, int b)
	    {
	        while(b != 0)
	        {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan  = new Scanner(System.in);
	        Jug s = new Jug();

	        int x = scan.nextInt();
	        int y = scan.nextInt();
	        int target = scan.nextInt();

	        boolean r = s.canMeasureWater(x,y,target);

	        System.out.print(r);
	    }
}
