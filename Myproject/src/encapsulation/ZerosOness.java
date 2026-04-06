package encapsulation;
import java.util.Scanner;
public class ZerosOness {

	   public boolean checkOnesSegment(String s) {
	        // If we ever see "01" in the string, it means another segment of ones starts later
	        return !s.contains("01");
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        ZerosOness sol = new ZerosOness();

	        String st = scan.next();
	        boolean r = sol.checkOnesSegment(st);

	        System.out.print(r);
	    }
}
