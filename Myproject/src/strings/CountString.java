package strings;
import java.util.Scanner;
public class CountString {

	public int mostWordsFound(String[] sentences) {
	    
	       int num=0;
	       for(int i=0;i<sentences.length;i++)
	       {
	          String[] s = sentences[i].split(" ");
	           num = Math.max(num,s.length);
	       }
	       return num;

	    }
	    public static void main(String[] args)
	    {
	        Scanner scan  = new Scanner(System.in);
	        CountString s =  new CountString();

	        int n =scan.nextInt();
	        String st[] = new String[n];
	        for(int i=0;i<st.length;i++)
	        {
	            st[i] = scan.nextLine();
	        }

	        int r = s.mostWordsFound(st);

	        System.out.print(r);
	    }

}
