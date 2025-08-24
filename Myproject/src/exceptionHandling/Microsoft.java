package exceptionHandling;
import java.util.Scanner;

public class Microsoft {

	
		    private String userName;
		    private int userAge;

		    // Method to take input from the user
		    public void getUserInput() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your name: ");
		        userName = scanner.nextLine();

		        System.out.print("Enter your age: ");
		        userAge = scanner.nextInt();

		        scanner.close();
		    }

		    // Method to display the input
		    public void displayUserInfo() {
		        System.out.println("Hello, " + userName + "! You are " + userAge + " years old.");
		    }

		    // Main method to run the program
		    public static void main(String[] args) {
		        Microsoft microsoftUser = new Microsoft();
		        microsoftUser.getUserInput();
		        microsoftUser.displayUserInfo();
		   
	}

}
