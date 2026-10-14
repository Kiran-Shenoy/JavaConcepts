package interfaces;
import java.util.Scanner;
public class TargetFile {

	 public int brokenCalc(int startValue, int target) {
	        
	        int operations = 0;
	        while(target > startValue)
	        {
	            if(target % 2 == 0)
	            {
	                target /= 2;
	            }
	            else
	            {
	                target += 1;
	            }
	            operations++;
	        }


	        return operations + (startValue - target);
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        TargetFile s = new TargetFile();

	        int start = scan.nextInt();
	        int target = scan.nextInt();

	        int r = s.brokenCalc(start,target);

	        System.out.print(r);
	    }

}
