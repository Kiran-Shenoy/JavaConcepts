package abstractClass;
import java.util.Scanner;
public class capitalise {

	 public String capitalizeTitle(String title) {
	        
	        String[] ss = title.split(" ");
	        StringBuilder sb = new StringBuilder();
	        for(String word : ss)
	        {
	            if(word.length() <=2)
	            {
	                sb.append(word.toLowerCase()).append(" ");
	                
	            }
	            else
	            {
	                sb.append(word.substring(0,1).toUpperCase()).append(word.substring(1).toLowerCase()).append(" ");
	            }
	        }
	        return sb.toString().trim();
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        capitalise s = new capitalise();

	       String st = scan.nextLine();

	       String r = s.capitalizeTitle(st);

	       System.out.print(r);

	    }


}
