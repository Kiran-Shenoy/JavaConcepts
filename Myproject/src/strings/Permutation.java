package strings;

import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		
		 System.out.println("Enter a string:");
	        String str = scan.nextLine();
	        System.out.println("Permutations of the string are:");
	        printPermutations(str, "");
	        scan.close();
	    }
	    
	    // Recursive function to print permutations of the string
	    public static void printPermutations(String str, String prefix) {
	        if (str.length() == 0) {
	            System.out.println(prefix);
	        } else {
	            for (int i = 0; i < str.length(); i++) {
	                // Choose one character
	                char ch = str.charAt(i);
	                // Rest of the string after removing the chosen character
	                String rest = str.substring(0, i) + str.substring(i + 1);
	                // Recurse with the remaining string and the prefix
	                printPermutations(rest, prefix + ch);
	            }
	}

}
}
