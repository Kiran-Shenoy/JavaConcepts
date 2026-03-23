package encapsulation;
import java.util.Scanner;
public class Ransom {

	 public boolean canConstruct(String ransomNote, String magazine) {
	        
	      int[] count = new int[26];
	      for(char c: magazine.toCharArray())
	      {
	          count[c-'a']++;
	      }

	      for(char c : ransomNote.toCharArray())
	      {
	        if(count[c-'a']==0)
	        {
	            return false;
	        }
	        count[c-'a']--;
	      }
	      return true;
	        
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        Ransom s = new Ransom();
	        

	        String m  =scan.next();
	        String n = scan.next();

	        boolean r = s.canConstruct(m,n);

	        System.out.print(r);
	    }

}
