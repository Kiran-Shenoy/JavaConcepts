package exceptionHandling;
import java.util.Scanner;

class Volume {
    // Instance variables
    double length;
    double width;
    double height;

    // Method to calculate volume
    double calculateVolume() {
        return length * width * height;
    }

    // Method to take user input
    void getInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = scanner.nextDouble();

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();
    }
}

public class VolumeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Volume v = new Volume();     // Create object
		        v.getInput();                // Get user input
		        double result = v.calculateVolume();  // Calculate volume

		        System.out.println("The volume of the cuboid is: " + result);
		    
	}

}
