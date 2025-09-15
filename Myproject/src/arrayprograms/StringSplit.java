package arrayprograms;
import java.util.Scanner;
public class StringSplit {
	  public String truncateSentence(String s, int k) {
	        String st[] = s.split(" ");
	        String res ="";
	        for(int i=0;i<st.length;i++)
	        {
	            if(i < k)
	            {
	                res = res + st[i] + " ";
	            }
	        }
	        String se = res.trim();
	        return se;
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        StringSplit s = new StringSplit();

	        int k = scan.nextInt();
	        String ss =scan.nextLine();
	       

	        String st = s.truncateSentence(ss , k);
	        System.out.print(st);

	    }

}
