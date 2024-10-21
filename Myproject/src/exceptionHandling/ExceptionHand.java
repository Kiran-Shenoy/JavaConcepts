package exceptionHandling;
import java.util.Scanner;
public class ExceptionHand {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // This line might throw an ArithmeticException if denominator is 0
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) {
            // Handles division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } 
        catch (Exception e) {
            // Handles any other unexpected exceptions
            System.out.println("An error occurred: " + e.getMessage());
        } 
        finally {
            // Code inside finally block always runs, even if an exception occurs
            System.out.println("Program finished.");
            scanner.close();
        }
	}

}
