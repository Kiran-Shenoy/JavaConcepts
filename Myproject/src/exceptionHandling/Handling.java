package exceptionHandling;
import java.util.Scanner;

public class Handling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            // Take input for the two numbers
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // Attempt division
            int result = numerator / denominator;

            // Display the result if no exception occurs
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");

        } finally {
            // This block always executes, regardless of exceptions
            System.out.println("End of program.");
            scanner.close();
        }

	}

}
