package exceptionHandling;
import java.util.Scanner;
public class Divide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        try {
		            System.out.print("Enter numerator: ");
		            int numerator = scanner.nextInt();
		            System.out.print("Enter denominator: ");
		            int denominator = scanner.nextInt();
		            
		            int result = numerator / denominator; // Possible division by zero
		            System.out.println("Result: " + result);
		        } catch (ArithmeticException e) {
		            System.out.println("Error: Division by zero is not allowed.");
		        } finally {
		            scanner.close();
		        }
		    

	}

}
