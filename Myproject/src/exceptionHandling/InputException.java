package exceptionHandling;
import java.util.Scanner;


       

public class InputException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	        
	        try {
	            System.out.print("Enter an integer: ");
	            int number = scanner.nextInt(); // Could throw an InputMismatchException
	            System.out.println("You entered: " + number);
	        } catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter a valid integer.");
	        } finally {
	            System.out.println("Scanner will be closed.");
	            scanner.close(); // Ensures the scanner is closed even if an exception occurs
	        }
	        
	        System.out.println("Program continues after exception handling.");
	  
	}

}
