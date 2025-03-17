package methodOverload;

public class Area {

	
		// TODO Auto-generated method stub


		    // Method to calculate area of a square
		    public double calculateArea(double side) {
		        return side * side;
		    }

		    // Overloaded method to calculate area of a rectangle
		    public double calculateArea(double length, double width) {
		        return length * width;
		    }

		    // Overloaded method to calculate area of a circle
		    public double calculateArea(double radius, boolean isCircle) {
		        return Math.PI * radius * radius;
		    }

		    public static void main(String[] args) {
		        Area calculator = new Area();

		        System.out.println("Area of square (side = 4): " + calculator.calculateArea(4));
		        System.out.println("Area of rectangle (length = 4, width = 5): " + calculator.calculateArea(4, 5));
		        System.out.println("Area of circle (radius = 3): " + calculator.calculateArea(3, true));
		   
	

	}

}
