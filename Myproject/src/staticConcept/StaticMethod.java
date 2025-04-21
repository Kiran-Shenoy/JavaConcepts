package staticConcept;
import java.util.Scanner;
public class StaticMethod {
	


	    // Static method to get user input
	    public static int getNumberFromUser() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();
	        return number;
	    }

	   

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Calling the static method
        int userNumber = getNumberFromUser();
        System.out.println("You entered: " + userNumber);
    }
}
