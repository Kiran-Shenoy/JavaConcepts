package strings;
import java.util.Scanner;


     
public class Empty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);

        // Input the string
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        // Check if the string is empty
        boolean isEmpty = inputString.isEmpty();

        // Print the result
        System.out.println("Is the string empty? " + isEmpty);

        scanner.close();

	}

}
