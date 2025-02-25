package strings;
import java.util.Scanner;
public class ReplaceLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	

	
		        Scanner scanner = new Scanner(System.in);

		        // Input the string
		        System.out.print("Enter the string: ");
		        String inputString = scanner.nextLine();

		        // Input the character to be replaced
		        System.out.print("Enter the character to be replaced: ");
		        char oldChar = scanner.next().charAt(0);

		        // Input the replacement character
		        System.out.print("Enter the replacement character: ");
		        char newChar = scanner.next().charAt(0);

		        // Replace the character and convert the result to lowercase
		        String replacedString = inputString.replace(oldChar, newChar).toLowerCase();

		        // Print the result
		        System.out.println("Original String: " + inputString);
		        System.out.println("Replaced and Lowercase String: " + replacedString);

		        scanner.close();
		    }
	

}
