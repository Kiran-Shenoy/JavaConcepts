package staticConcept;
import java.util.Scanner;

class Ring {
    // Static variable to count total rings created
    static int ringCount = 0;

    // Instance variables
    String material;
    double diameter;

    // Constructor
    Ring(String material, double diameter) {
        this.material = material;
        this.diameter = diameter;
        ringCount++; // Increment static counter
    }

    // Method to display ring details
    void display() {
        System.out.println("Ring made of " + material + " with diameter " + diameter + " cm.");
    }

    // Static method to show total rings
    static void showTotalRings() {
        System.out.println("Total rings created: " + ringCount);
    }
}

public class RingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("How many rings do you want to create? ");
		        int n = scanner.nextInt();
		        scanner.nextLine(); // Consume newline

		        Ring[] rings = new Ring[n];

		        for (int i = 0; i < n; i++) {
		            System.out.println("\nEnter details for Ring " + (i + 1) + ":");
		            System.out.print("Material: ");
		            String material = scanner.nextLine();
		            System.out.print("Diameter (in cm): ");
		            double diameter = scanner.nextDouble();
		            scanner.nextLine(); // Consume newline

		            rings[i] = new Ring(material, diameter);
		        }

		        System.out.println("\n--- Ring Details ---");
		        for (Ring ring : rings) {
		            ring.display();
		        }

		        // Call static method to show total rings
		        Ring.showTotalRings();

		        scanner.close();
		   

	}

}
