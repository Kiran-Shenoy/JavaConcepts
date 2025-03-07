package methodOverload;

public class ShapeAreaCalculator {

	    // Method to calculate the area of a rectangle
	    public double calculateArea(double length, double width) {
	        return length * width;
	    }

	    // Method to calculate the area of a circle
	    public double calculateArea1(double radius) {
	        return Math.PI * radius * radius;
	    }

	    // Method to calculate the area of a triangle
	    public double calculateArea(double base, double height, boolean isTriangle) {
	        return 0.5 * base * height;
	    }

	    // Method to calculate the area of a square
	    public double calculateArea(double side) {
	        return side * side;
	    }

	    public static void main(String[] args) {
	        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

	        // Testing method overloading for different shapes
	        System.out.println("Area of the rectangle: " + calculator.calculateArea(5.0, 10.0)); // Output: 50.0
	        System.out.println("Area of the circle: " + calculator.calculateArea1(7.0)); // Output: 153.93804002589985
	        System.out.println("Area of the triangle: " + calculator.calculateArea(5.0, 12.0, true)); // Output: 30.0
	        System.out.println("Area of the square: " + calculator.calculateArea1(5.0)); // Output: 25.0
	    }
	}

	
