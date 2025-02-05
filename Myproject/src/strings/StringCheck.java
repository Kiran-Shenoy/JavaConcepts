package strings;
import java.util.Scanner;
public class StringCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Input the string
		        System.out.print("Enter the string: ");
		        String inputString = scanner.nextLine();

		        // Input the prefix
		        System.out.print("Enter the prefix: ");
		        String prefix = scanner.nextLine();

		        // Check if the string starts with the prefix
		        boolean result = inputString.startsWith(prefix);

		        // Print the result
		        System.out.println(result);

		        scanner.close();
		   

	}

}
