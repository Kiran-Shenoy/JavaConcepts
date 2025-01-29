package strings;
import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			        Scanner scanner = new Scanner(System.in);

		        // Input the first string
		        System.out.print("Enter the first string: ");
		        String string1 = scanner.nextLine();

		        // Input the second string
		        System.out.print("Enter the second string: ");
		        String string2 = scanner.nextLine();

		        // Compare the strings for equality and store the result in a boolean
		        boolean isEqual = string1.equals(string2);

		        // Print the result
		        System.out.println(isEqual);

		        scanner.close();
		

	}

}
