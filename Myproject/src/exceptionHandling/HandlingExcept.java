package exceptionHandling;
import java.util.Scanner;
public class HandlingExcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Enter numerator: ");
	            int numerator = scanner.nextInt();

	            System.out.print("Enter denominator: ");
	            int denominator = scanner.nextInt();

	            // Division operation
	            int result = numerator / denominator;
	            System.out.println("Result: " + result);

	        } catch (ArithmeticException e) {
	            System.out.println("Error: Division by zero is not allowed.");
	        } catch (Exception e) {
	            System.out.println("An unexpected error occurred: " + e.getMessage());
	        } finally {
	            System.out.println("Thank you for using the program!");
	            scanner.close();
	        }
	    }
	}