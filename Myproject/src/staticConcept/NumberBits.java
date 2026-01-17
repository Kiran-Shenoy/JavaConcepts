package staticConcept;
import java.util.Scanner;
public class NumberBits {

	 public int hammingWeight(int n) {
	        int count=0;
	        String ss = Integer.toBinaryString(n);

	        for(int i=0;i<ss.length();i++)
	        {
	            if(ss.charAt(i) == '1')
	            {
	                count++;
	            }
	        }
	        return count;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        NumberBits s = new NumberBits();

	        int n = scan.nextInt();

	        int r = s.hammingWeight(n);

	        System.out.print(r);
	    }

}
