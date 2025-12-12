package arrayprograms;
import java.util.Scanner;
public class Char {

	 public char nextGreatestLetter(char[] letters, char target) {
         
	      for(char num:letters)
	      {
	        if(num > target)
	        {
	            return num;
	        }
	      }
	      return letters[0];
	        
	    }
	    public static void msin(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Char s = new Char();

	        int n = scan.nextInt();
	        char[] c = new char[n];
	        for(int i=0;i<n;i++)
	        {
	            c[i] = scan.next().charAt(0);
	        }
	        char tar = scan.next().charAt(0);
	        char r = s.nextGreatestLetter(c,tar);

	        System.out.print(r);
	    }

}
