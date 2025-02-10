package strings;
import java.util.Scanner;
public class LastIndex {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        // Input the string
		        System.out.print("Enter the string: ");
		        String inputString = scanner.nextLine();

		        // Input the character
		        System.out.print("Enter the character: ");
		        char character = scanner.next().charAt(0);

		        // Find the last index of the character
		        int lastIndex = inputString.lastIndexOf(character);

		        // Print the result
		        if (lastIndex != -1) {
		            System.out.println("Last index of character '" + character + "': " + lastIndex);
		        } else {
		            System.out.println("Character '" + character + "' not found in the string.");
		        }

		        scanner.close();
	} 


}
