package collections;
import java.util.*;
public class ReverseVowels {
	 public String reverseVowels(String s) {
	        
	        String vowels = "AEIOUaeiou";
	        int left = 0;
	        int right = s.length() -1;

	        char ar[] = s.toCharArray();

	        while(left < right)
	        {
	            while(left < right && vowels.indexOf(ar[left]) == -1)
	            {
	                left++;
	            }
	            while(left < right && vowels.indexOf(ar[right]) == -1)
	            {
	                right--;
	            }
	            char temp = ar[left];
	            ar[left] = ar[right];
	            ar[right] = temp;

	            left++;
	            right--;
	        }
	        return new String(ar);
	    }
	    public static void main(String[] args)
	    {
	        Scanner scan = new Scanner(System.in);
	        ReverseVowels s = new ReverseVowels();

	        String st = scan.next();

	        String r = s.reverseVowels(st);

	        System.out.print(r);
	    }

}
