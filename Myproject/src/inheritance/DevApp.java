package inheritance;
import java.util.Scanner;

// Base class
class Developer {
    String name;
    int experience;

    void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter developer name: ");
        name = scanner.nextLine();
        System.out.print("Enter years of experience: ");
        experience = scanner.nextInt();
        scanner.nextLine(); // consume newline
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experience + " years");
    }
}

// Derived class
class FrontendDeveloper extends Developer {
    String preferredFramework;

    void getFrontendDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter preferred frontend framework (e.g., React, Angular): ");
        preferredFramework = scanner.nextLine();
    }

    void displayFrontendDetails() {
        displayDetails();
        System.out.println("Preferred Frontend Framework: " + preferredFramework);
    }
}

public class DevApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        FrontendDeveloper dev = new FrontendDeveloper();
		        dev.getDetails();
		        dev.getFrontendDetails();
		        System.out.println("\n--- Developer Profile ---");
		        dev.displayFrontendDetails();
		    
	}

}
