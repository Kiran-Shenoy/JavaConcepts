package methodOverload;

public class CalcSub {

	    // Method to subtract two integers
	    public int subtract(int a, int b) {
	        return a - b;
	    }

	    // Method to subtract three integers
	    public int subtract(int a, int b, int c) {
	        return a - b - c;
	    }

	    // Method to subtract two double values
	    public double subtract(double a, double b) {
	        return a - b;
	    }

	    // Method to subtract three double values
	    public double subtract(double a, double b, double c) {
	        return a - b - c;
	    }

	    // Method to subtract one integer and one double value
	    public double subtract(int a, double b) {
	        return a - b;
	    }

	    // Method to subtract one double and one integer value
	    public double subtract(double a, int b) {
	        return a - b;
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcSub calculator = new CalcSub();

	        // Testing method overloading with integers
	        System.out.println("Subtraction of two integers: " + calculator.subtract(15, 5)); // Output: 10
	        System.out.println("Subtraction of three integers: " + calculator.subtract(20, 5, 3)); // Output: 12

	        // Testing method overloading with doubles
	        System.out.println("Subtraction of two doubles: " + calculator.subtract(15.5, 5.5)); // Output: 10.0
	        System.out.println("Subtraction of three doubles: " + calculator.subtract(20.5, 5.5, 3.5)); // Output: 11.5

	        // Testing method overloading with one integer and one double
	        System.out.println("Subtraction of one integer and one double: " + calculator.subtract(15, 5.5)); // Output: 9.5
	        System.out.println("Subtraction of one double and one integer: " + calculator.subtract(15.5, 5)); // Output: 10.5
	  
	}

}
