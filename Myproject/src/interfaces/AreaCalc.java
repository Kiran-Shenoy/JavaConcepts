package interfaces;
//TODO Auto-generated method stub
		import java.util.Scanner;

		// Interface remains the same
		interface Geometry {
		    double getArea();
		}

		// Renamed Circle as RoundShape
		class RoundShape implements Geometry {
		    private double radius;
		    RoundShape(double radius) {
		        this.radius = radius;
		    }
		    public double getArea() {
		        return Math.PI * radius * radius;
		    }
		}

		// Renamed Rectangle as BoxShape
		class BoxShape implements Geometry {
		    private double length, width;
		    BoxShape(double length, double width) {
		        this.length = length;
		        this.width = width;
		    }
		    public double getArea() {
		        return length * width;
		    }
		}

public class AreaCalc {

	public static void main(String[] args) {
		
		// Main driver class renamed as AreaCalculator
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Select a shape (1 - RoundShape, 2 - BoxShape): ");
		        int choice = scanner.nextInt();

		        Geometry shape = null;

		        switch (choice) {
		            case 1:
		                System.out.print("Enter the radius: ");
		                double radius = scanner.nextDouble();
		                shape = new RoundShape(radius);
		                break;
		            case 2:
		                System.out.print("Enter the length: ");
		                double length = scanner.nextDouble();
		                System.out.print("Enter the width: ");
		                double width = scanner.nextDouble();
		                shape = new BoxShape(length, width);
		                break;
		            default:
		                System.out.println("Oops! Invalid option.");
		        }

		        if (shape != null) {
		            System.out.println("Computed Area: " + shape.getArea());
		        }

		        scanner.close();
		  

	}

}
