package staticConcept;
import java.util.Scanner;

class Desktop {
    // Static variable shared by all instances
    static String operatingSystem = "Windows";

    // Instance variable
    String ownerName;

    // Static method
    static void displayOS() {
        System.out.println("Operating System: " + operatingSystem);
    }

    // Instance method
    void displayOwner() {
        System.out.println("Desktop Owner: " + ownerName);
    }
}


public class Desk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        // Get user input
		        System.out.print("Enter owner name for the desktop: ");
		        String name = scanner.nextLine();

		        // Create an object and assign user input
		        Desktop myDesktop = new Desktop();
		        myDesktop.ownerName = name;

		        // Access static method without creating an object
		        Desktop.displayOS();

		        // Access instance method through object
		        myDesktop.displayOwner();

		        scanner.close();
		    
	}

}
