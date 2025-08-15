package methodOverload;
import java.util.Scanner;

// Base class
class Spectacles {
    String brand;
    double price;

    // Method to display details
    void displayDetails() {
        System.out.println("Spectacles Brand: " + brand);
        System.out.println("Price: ₹" + price);
    }
}

// Derived class that overrides displayDetails
class SmartSpectacles extends Spectacles {
    String feature;

    // Overriding the method
    @Override
    void displayDetails() {
        System.out.println("Smart Spectacles Brand: " + brand);
        System.out.println("Price: ₹" + price);
        System.out.println("Special Feature: " + feature);
    }
}

public class SpectaclesDemo {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);

		        // User input for basic spectacles
		        System.out.println("Enter brand of regular spectacles:");
		        String brand1 = scanner.nextLine();
		        System.out.println("Enter price of regular spectacles:");
		        double price1 = scanner.nextDouble();
		        scanner.nextLine(); // consume newline

		        Spectacles regular = new Spectacles();
		        regular.brand = brand1;
		        regular.price = price1;

		        // User input for smart spectacles
		        System.out.println("\nEnter brand of smart spectacles:");
		        String brand2 = scanner.nextLine();
		        System.out.println("Enter price of smart spectacles:");
		        double price2 = scanner.nextDouble();
		        scanner.nextLine(); // consume newline
		        System.out.println("Enter special feature of smart spectacles:");
		        String feature = scanner.nextLine();

		        SmartSpectacles smart = new SmartSpectacles();
		        smart.brand = brand2;
		        smart.price = price2;
		        smart.feature = feature;

		        // Displaying details
		        System.out.println("\n--- Regular Spectacles ---");
		        regular.displayDetails();

		        System.out.println("\n--- Smart Spectacles ---");
		        smart.displayDetails();

		        scanner.close();
		  

	}

}
