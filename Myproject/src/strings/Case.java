package strings;
import java.util.Scanner;
public class Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Input the first string
		        System.out.print("Enter the first string: ");
		        String string1 = scanner.nextLine();

		        // Input the second string
		        System.out.print("Enter the second string: ");
		        String string2 = scanner.nextLine();

		        // Compare the strings for equality, ignoring case
		        boolean isEqual = string1.equalsIgnoreCase(string2);

		        // Print the result
		        System.out.println(isEqual);

		        scanner.close();

	}

}
