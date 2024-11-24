package exceptionHandling;

import java.util.Scanner;
 

public class ExceptionExample {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        try {
		            // Input two numbers
		            System.out.println("Enter the numerator:");
		            int numerator = scanner.nextInt();

		            System.out.println("Enter the denominator:");
		            int denominator = scanner.nextInt();

		            // Perform division
		            int result = numerator / denominator;
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            // Handle division by zero
		            System.out.println("Error: Division by zero is not allowed.");
		        } catch (Exception e) {
		            // Handle other exceptions
		            System.out.println("An unexpected error occurred: " + e.getMessage());
		        } finally {
		            // Close the scanner resource
		            System.out.println("Execution completed. Closing resources...");
		            scanner.close();
		 
	}

}
}
