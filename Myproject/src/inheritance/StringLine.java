package inheritance;
import java.util.Scanner;
public class StringLine {

	 public int countSegments(String s) {
	        
	        if(s == null || s.trim().isEmpty()) return 0;
	        String a[] = s.trim().split("\\s+");
	        return a.length;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        StringLine s = new StringLine();

	        String st = scan.nextLine();

	        int r = s.countSegments(st);

	        System.out.print(r);
	    }

}
