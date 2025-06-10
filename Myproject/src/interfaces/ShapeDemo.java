package interfaces;
import java.util.Scanner;

// Define an interface
interface GeometricShape {
    void calculateArea(); // Abstract method
}

// Implement the interface in a class
class RoundShape implements GeometricShape {
    private double radius;

    // Constructor to initialize the radius
    public RoundShape(double radius) {
        this.radius = radius;
    }

    // Implement the abstract method
    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("The area of the round shape is: " + area);
    }
}

public class ShapeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Get user input
		        System.out.print("Enter the radius of the shape: ");
		        double radius = scanner.nextDouble();

		        // Create an object of RoundShape and calculate area
		        RoundShape shape = new RoundShape(radius);
		        shape.calculateArea();

		        scanner.close();
		 

	}

}
