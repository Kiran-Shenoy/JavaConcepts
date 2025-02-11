package strings;
import java.util.Scanner;
public class Timmed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);

		        // Input the string with potential white spaces
		        System.out.print("Enter the string: ");
		        String inputString = scanner.nextLine();

		        // Trim white space from the beginning and end of the string
		        String trimmedString = inputString.trim();

		        // Print the original and trimmed strings
		        System.out.println("Original String: \"" + inputString + "\"");
		        System.out.println("Trimmed String: \"" + trimmedString + "\"");

		        scanner.close();
		   

	}

}
