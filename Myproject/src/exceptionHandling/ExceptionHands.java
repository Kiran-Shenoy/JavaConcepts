package exceptionHandling;
import java.util.Scanner;
public class ExceptionHands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	
		        Scanner scanner = new Scanner(System.in);
		        
		        try {
		            System.out.print("Enter an integer: ");
		            int number = scanner.nextInt();
		            
		            // Example operation that may cause an exception
		            int result = 100 / number;
		            System.out.println("100 divided by " + number + " is: " + result);
		            
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero is not allowed.");
		        } catch (Exception e) {
		            System.out.println("Error: Invalid input. Please enter a valid integer.");
		        } finally {
		            scanner.close();
		            System.out.println("Scanner closed.");
		      
		}

	}

}
