package strings;
import java.util.Scanner;
public class Retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		        Scanner scanner = new Scanner(System.in);

		        // Input the string
		        System.out.print("Enter the string: ");
		        String inputString = scanner.nextLine();

		        // Input the index
		        System.out.print("Enter the index: ");
		        int index = scanner.nextInt();

		        // Retrieve and print the character at the specified index
		        if (index >= 0 && index < inputString.length()) {
		            char result = inputString.charAt(index);
		            System.out.println("Character at index " + index + ": " + result);
		        } else {
		            System.out.println("Index out of bounds.");
		        }

		        scanner.close();
		  

	}

}
