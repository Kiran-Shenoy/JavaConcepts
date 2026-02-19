package aggregateComposite;
import java.util.Scanner;
public class MergeSort {
	 public String mergeAlternately(String word1, String word2) {
	        
	        String res = "";
	        int i=0,j=0;
	        while(i < word1.length() && j < word2.length())
	        {
	            res = res + word1.charAt(i) + word2.charAt(j);
	            i++;
	            j++;
	        }

	        while(i< word1.length())
	        {
	            res += word1.charAt(i);
	            i++;
	        }
	        while(j< word2.length())
	        {
	            res += word2.charAt(j);
	            j++;
	        }
	        return res;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		MergeSort s = new MergeSort();
		
		String s1 = scan.next();
		String s2 = scan.next();
		
		String r  =s.mergeAlternately(s1, s2);
		
		System.out.print(r);
		
	}

}
