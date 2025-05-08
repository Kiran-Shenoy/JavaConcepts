package exceptionHandling;
import java.util.Scanner;

class UncommonException extends Exception {
    public UncommonException(String message) {
        super(message);
    }
}
public class Rare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);
		        
		        try {
		            System.out.print("Enter a number: ");
		            int num = Integer.parseInt(scanner.nextLine());
		            
		            if (num < 0) {
		                throw new UncommonException("Negative numbers are not allowed!");
		            }
		            
		            System.out.println("You entered: " + num);
		        } catch (UncommonException e) {
		            System.out.println("Caught custom exception: " + e.getMessage());
		        } catch (NumberFormatException e) {
		            System.out.println("Caught NumberFormatException: Please enter a valid integer.");
		        } finally {
		            scanner.close();
		            System.out.println("Scanner resource closed.");
		        }
		    }
	

}
