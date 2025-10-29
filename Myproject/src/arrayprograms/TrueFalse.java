package arrayprograms;
import java.util.Scanner;
public class TrueFalse {

	  public boolean isThree(int n) {
	        int count=0;
	        int i=1;
	        while(i<=n)
	        {
	            if(n%i==0)
	            {
	               count++;
	               
	            }
	            i++;
	        }
	        if(count==3)
	        {
	            return true;
	        }
	        else
	        {
	            return false;
	        }
	    }
	     public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        TrueFalse s  = new TrueFalse();

	        int n = scan.nextInt();

	        
	        boolean r = s.isThree(n);

	        System.out.print(r);
	    }

}
