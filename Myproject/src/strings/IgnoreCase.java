package strings;
import java.util.Scanner;
public class IgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        // Input the first string
		        System.out.print("Enter the first string: ");
		        String string1 = scanner.nextLine();

		        // Input the second string
		        System.out.print("Enter the second string: ");
		        String string2 = scanner.nextLine();

		        // Convert both strings to lowercase for case-insensitive comparison
		        String lowerString1 = string1.toLowerCase();
		        String lowerString2 = string2.toLowerCase();

		        // Compare the strings lexicographically
		        int comparisonResult = lowerString1.compareTo(lowerString2);

		        // Print the result with the desired messages
		        if (comparisonResult < 0) {
		            System.out.println("Second string is greater.");
		        } else if (comparisonResult > 0) {
		            System.out.println("First string is greater.");
		        } else {
		            System.out.println("Both strings are equal.");
		        }

		        scanner.close();
		  
	}

}
