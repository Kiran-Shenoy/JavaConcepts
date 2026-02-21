package encapsulation;
import java.util.Scanner;
public class StringReverse {

	public String reverseWords(String s) {
	       String q = ""; 
	       String[] ar = s.split(" ");
	       for(int i=0;i<ar.length;i++)
	       {
	           String rev = reverseOf(ar[i]);
	           q = q + rev +" ";
	       }
	       return q.trim();
	    }
	       private static String reverseOf(String st)
	       {
	         String f = "";
	         for(int j = st.length()-1;j>=0;j--)
	         {
	            f = f + st.charAt(j);
	         }
	         return f;
	       }

	    
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        StringReverse s = new StringReverse();

	        String s1 = scan.nextLine();

	        String r = s.reverseWords(s1);

	        System.out.print(r);


	    }

}
