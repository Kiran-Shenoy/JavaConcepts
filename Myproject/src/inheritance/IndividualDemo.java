package inheritance;
import java.util.Scanner;

// Base class
class Individual {
    String fullName;
    int years;

    // Constructor
    Individual(String fullName, int years) {
        this.fullName = fullName;
        this.years = years;
    }

    // Method to display details
    void showDetails() {
        System.out.println("Full Name: " + fullName);
        System.out.println("Years: " + years);
    }
}

// Derived class extending Individual
class Learner extends Individual {
    int learnerID;

    // Constructor using super()
    Learner(String fullName, int years, int learnerID) {
        super(fullName, years);
        this.learnerID = learnerID;
    }

    // Overriding showDetails method
    void showDetails() {
        super.showDetails();
        System.out.println("Learner ID: " + learnerID);
    }
}

public class IndividualDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Taking user input
		        System.out.print("Enter full name: ");
		        String fullName = scanner.nextLine();

		        System.out.print("Enter years: ");
		        int years = scanner.nextInt();

		        System.out.print("Enter learner ID: ");
		        int learnerID = scanner.nextInt();

		        // Creating Learner object
		        Learner learner = new Learner(fullName, years, learnerID);

		        // Displaying learner details
		        System.out.println("\nLearner Details:");
		        learner.showDetails();

		        scanner.close();
	}

}
