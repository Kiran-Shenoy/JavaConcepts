package strings;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        // Input string
        System.out.println("Enter a string:");
        String input = scan.nextLine();
        
        // Call method to remove vowels
        String result = removeVowels(input);
        
        // Output the result
        System.out.println("String after removing vowels: " + result);
        
        scan.close();
    }
    
    // Method to remove vowels from the string
    public static String removeVowels(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }

	}


