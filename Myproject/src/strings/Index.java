package strings;
import java.util.Scanner;
public class Index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        // Input the string
		        System.out.print("Enter the string: ");
		        String inputString = scanner.nextLine();

		        // Input the character
		        System.out.print("Enter the character: ");
		        char character = scanner.next().charAt(0);

		        // Find the index of the character
		        int index = inputString.indexOf(character);

		        // Print the result
		        if (index != -1) {
		            System.out.println("Index of character '" + character + "': " + index);
		        } else {
		            System.out.println("Character '" + character + "' not found in the string.");
		        }

		        scanner.close();
		   

	}

}
