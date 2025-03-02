package methodOverload;

public class CalcMulti {
	
	    // Method to multiply two integers
	    public int multiply(int a, int b) {
	        return a * b;
	    }

	    // Method to multiply three integers
	    public int multiply(int a, int b, int c) {
	        return a * b * c;
	    }

	    // Method to multiply two double values
	    public double multiply(double a, double b) {
	        return a * b;
	    }

	    // Method to multiply three double values
	    public double multiply(double a, double b, double c) {
	        return a * b * c;
	    }

	    // Method to multiply one integer and one double value
	    public double multiply(int a, double b) {
	        return a * b;
	    }

	    // Method to multiply one double and one integer value
	    public double multiply(double a, int b) {
	        return a * b;
	    }

	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalcMulti calculator = new CalcMulti();

        // Testing method overloading with integers
        System.out.println("Multiplication of two integers: " + calculator.multiply(5, 10)); // Output: 50
        System.out.println("Multiplication of three integers: " + calculator.multiply(5, 10, 2)); // Output: 100

        // Testing method overloading with doubles
        System.out.println("Multiplication of two doubles: " + calculator.multiply(5.5, 10.5)); // Output: 57.75
        System.out.println("Multiplication of three doubles: " + calculator.multiply(5.5, 10.5, 2.0)); // Output: 115.5

        // Testing method overloading with one integer and one double
        System.out.println("Multiplication of one integer and one double: " + calculator.multiply(5, 10.5)); // Output: 52.5
        System.out.println("Multiplication of one double and one integer: " + calculator.multiply(5.5, 10)); // Output: 55.0

	}

}
