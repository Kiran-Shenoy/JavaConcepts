package exceptionHandling;
import java.util.Scanner;


public class MobilePass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        String predefinedPassword = "mySecurePassword123";

		        try {
		            System.out.print("Enter your mobile password: ");
		            String enteredPassword = scanner.nextLine();

		            if (checkPassword(predefinedPassword, enteredPassword)) {
		                System.out.println("Access Granted.");
		            } else {
		                System.out.println("Access Denied. Incorrect Password.");
		            }
		        } catch (Exception e) {
		            System.out.println("An unexpected error occurred: " + e.getMessage());
		        } finally {
		            System.out.println("Closing the scanner.");
		            scanner.close();
		        }
		    }

		    public static boolean checkPassword(String predefinedPassword, String enteredPassword) {
		        return predefinedPassword.equals(enteredPassword);
	

	}

}
