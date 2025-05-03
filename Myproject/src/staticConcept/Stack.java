package staticConcept;
import java.util.Scanner;


class Utility {
    // Static method to greet the user
    static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the program.");
    }

    // Static method to calculate the square of a number
    static int calculateSquare(int number) {
        return number * number;
    }
}

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);

		        // Taking user input
		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();

		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();

		        // Calling static methods from Utility class
		        Utility.greetUser(name);
		        int square = Utility.calculateSquare(number);

		        // Displaying the result
		        System.out.println("The square of " + number + " is: " + square);

		        scanner.close(); // Close the scanner to free resources
		   

	}

}
