package methodOverload;

public class ShapePeri {

	    // Method to calculate the perimeter of a rectangle
	    public double calculatePerimeter(double length, double width) {
	        return 2 * (length + width);
	    }

	    // Method to calculate the perimeter of a circle
	    public double calculatePerimeter(double radius) {
	        return 2 * Math.PI * radius;
	    }

	    // Method to calculate the perimeter of a triangle
	    public int calculatePerimeter(int side1, int side2, int side3) {
	        return side1 + side2 + side3;
	    }

	    // Method to calculate the perimeter of a square
	    public int calculatePerimeter(int side) {
	        return 4 * side;
	    }

	    public static void main(String[] args) {
	    	ShapePeri calculator = new ShapePeri();

	        // Testing method overloading for different shapes
	        System.out.println("Perimeter of the rectangle: " + calculator.calculatePerimeter(5.0, 10.0)); // Output: 30.0
	        System.out.println("Perimeter of the circle: " + calculator.calculatePerimeter(7.0)); // Output: 43.982297150257104
	        System.out.println("Perimeter of the triangle: " + calculator.calculatePerimeter(5, 12, 13)); // Output: 30
	        System.out.println("Perimeter of the square: " + calculator.calculatePerimeter(5)); // Output: 20
	    }


}
