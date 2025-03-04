package methodOverload;

public class ShapeArea {

	    // Method to calculate the area of a rectangle
	    public double calculateArea(double length, double width) {
	        return length * width;
	    }

	    // Method to calculate the area of a circle
	    public double calculateArea(double radius) {
	        return Math.PI * radius * radius;
	    }

	    // Method to calculate the area of a triangle
	    public double calculateArea(double base, double height, boolean isTriangle) {
	        return 0.5 * base * height;
	    }

	    // Method to calculate the area of a square
	    public double calculateArea(int side) {
	        return side * side;
	    }

	    public static void main(String[] args) {
	    	ShapeArea calculator = new ShapeArea();

	        // Testing method overloading for different shapes
	        System.out.println("Area of the rectangle: " + calculator.calculateArea(5.0, 10.0)); // Output: 50.0
	        System.out.println("Area of the circle: " + calculator.calculateArea(7.0)); // Output: 153.93804002589985
	        System.out.println("Area of the triangle: " + calculator.calculateArea(5.0, 12.0, true)); // Output: 30.0
	        System.out.println("Area of the square: " + calculator.calculateArea(5)); // Output: 25.0
	    }
	}

	
