package interfaces;
import java.util.Scanner;
public class CompareVersionss {

	 public int compareVersion(String version1, String version2) {
	        
	        String v1[] = version1.split("\\.");
	        String v2[] = version2.split("\\.");
	        
	        int n = Math.max(v1.length,v2.length);

	        for(int i=0;i<n;i++)
	        {
	            int num1 = (i<v1.length) ? Integer.parseInt(v1[i]) : 0;
	            int num2 = (i<v2.length) ? Integer.parseInt(v2[i]) : 0;

	            if(num1 < num2) return -1;
	            if(num1 > num2) return 1; 
	        }
	        return 0;

	        

	    }
	    public  static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        CompareVersionss s = new CompareVersionss();

	        String v1 = scan.next();
	        String v2 = scan.next();

	        int r = s.compareVersion(v1,v2);

	        System.out.print(r);
	    }

}
