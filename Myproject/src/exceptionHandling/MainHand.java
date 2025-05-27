package exceptionHandling;
import java.util.Scanner;

class UserInputHandler {
    public int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a valid integer.");
            return -1; // Default value indicating error
        }
    }
}

class NumberProcessor {
    public void processNumber(int num) {
        try {
            if (num < 0) {
                throw new IllegalArgumentException("Negative numbers are not allowed.");
            }
            System.out.println("Processing number: " + num);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class MainHand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        UserInputHandler inputHandler = new UserInputHandler();
		        NumberProcessor processor = new NumberProcessor();
		        
		        int userNumber = inputHandler.getNumberFromUser();
		        processor.processNumber(userNumber);
		    
	}

}
