package exceptionHandling;

import java.util.Scanner;




public class ExceptZero {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter the numerator: ");
	            int numerator = scanner.nextInt();
	            System.out.print("Enter the denominator: ");
	            int denominator = scanner.nextInt();
	            
	            // Attempt to divide
	            int result = numerator / denominator;
	            System.out.println("Result: " + result);
	        } catch (ArithmeticException e) {
	            // Handle the division by zero case
	            System.out.println("Error: Division by zero is not allowed.");
	        } finally {
	            // Close the scanner resource
	            scanner.close();
	            System.out.println("Scanner closed.");
	        }
	    }
	}