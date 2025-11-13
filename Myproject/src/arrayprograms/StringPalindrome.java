package arrayprograms;
import java.util.Scanner;
public class StringPalindrome {

	 public String firstPalindrome(String[] words) {
	        
	        for(int i=0;i<words.length;i++)
	        {
	            if(palindrome(words[i]) == true)
	            {
	                return words[i];
	            }
	        }
	        return "";
	    }
	        private boolean palindrome(String s)
	        {
	            int i=0, j=s.length()-1;
	            while(i<=j)
	            {
	                if(s.charAt(i) == s.charAt(j))
	                {
	                    i++;
	                    j--;
	                }
	                else
	                {
	                    return false;
	                }
	            }
	            return true;
	        
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        StringPalindrome s = new StringPalindrome();

	        int n = scan.nextInt();
	        String st[] = new String[n];
	        for(int i=0;i<n;i++)
	        {
	            st[i] = scan.next();
	        }

	        String r = s.firstPalindrome(st);

	        System.out.print(r);
	    }

}
