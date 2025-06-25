package exceptionHandling;
import java.util.Scanner;
public class ThrowsExample {
	 public static int getNumber() throws NumberFormatException {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        String input = scanner.nextLine();
	        return Integer.parseInt(input); // This can throw NumberFormatException
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		    
		   

		   
		        try {
		            int number = getNumber();
		            System.out.println("You entered: " + number);
		        } catch (NumberFormatException e) {
		            System.out.println("Invalid input! Please enter a valid integer.");
		        }
		    }


}
