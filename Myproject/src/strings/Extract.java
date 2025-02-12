package strings;
import java.util.Scanner;
public class Extract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


		        Scanner scanner = new Scanner(System.in);

		        // Input the string
		        System.out.print("Enter the string: ");
		        String inputString = scanner.nextLine();

		        // Input the starting index
		        System.out.print("Enter the starting index: ");
		        int startIndex = scanner.nextInt();

		        // Check if the starting index is within the valid range
		        if (startIndex >= 0 && startIndex < inputString.length()) {
		            // Extract the substring from the starting index
		            String substring = inputString.substring(startIndex);
		            // Print the result
		            System.out.println("Substring: " + substring);
		        } else {
		            System.out.println("Invalid starting index.");
		        }

		        scanner.close();
		
	}

}
