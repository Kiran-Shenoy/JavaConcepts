package strings;
import java.util.Scanner;
public class Replace {

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

		        // Replace the character in the string
		        String replacedString = inputString.replace(oldChar, newChar);

		        // Print the result
		        System.out.println("Original String: " + inputString);
		        System.out.println("Replaced String: " + replacedString);

		        scanner.close();
		   

	}

}
