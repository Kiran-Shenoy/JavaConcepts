package methodOverload;

public class CalDiv {

	    // Method to divide two integers
	    public double divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        return (double) a / b;
	    }

	    // Method to divide three integers
	    public double divide(int a, int b, int c) {
	        if (b == 0 || c == 0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        return (double) a / b / c;
	    }

	    // Method to divide two double values
	    public double divide(double a, double b) {
	        if (b == 0.0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        return a / b;
	    }

	    // Method to divide three double values
	    public double divide(double a, double b, double c) {
	        if (b == 0.0 || c == 0.0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        return a / b / c;
	    }

	    // Method to divide one integer and one double value
	    public double divide(int a, double b) {
	        if (b == 0.0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        return a / b;
	    }

	    // Method to divide one double and one integer value
	    public double divide(double a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        return a / b;
	  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalDiv calculator = new CalDiv();

        // Testing method overloading with integers
        System.out.println("Division of two integers: " + calculator.divide(10, 5)); // Output: 2.0
        System.out.println("Division of three integers: " + calculator.divide(20, 5, 2)); // Output: 2.0

        // Testing method overloading with doubles
        System.out.println("Division of two doubles: " + calculator.divide(20.0, 5.0)); // Output: 4.0
        System.out.println("Division of three doubles: " + calculator.divide(20.0, 5.0, 2.0)); // Output: 2.0

        // Testing method overloading with one integer and one double
        System.out.println("Division of one integer and one double: " + calculator.divide(10, 2.5)); // Output: 4.0
        System.out.println("Division of one double and one integer: " + calculator.divide(20.0, 4)); // Output: 5.0
   
	}

}
