package methodOverload;

public class Calculator {

	    // Method to add two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method to add three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method to add two double values
	    public double add(double a, double b) {
	        return a + b;
	    }

	    // Method to add three double values
	    public double add(double a, double b, double c) {
	        return a + b + c;
	    }

	    // Method to add one integer and one double value
	    public double add(int a, double b) {
	        return a + b;
	    }

	    // Method to add one double and one integer value
	    public double add(double a, int b) {
	        return a + b;
	      }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Calculator calculator = new Calculator();

        // Testing method overloading with integers
        System.out.println("Addition of two integers: " + calculator.add(5, 10)); // Output: 15
        System.out.println("Addition of three integers: " + calculator.add(5, 10, 15)); // Output: 30

        // Testing method overloading with doubles
        System.out.println("Addition of two doubles: " + calculator.add(5.5, 10.5)); // Output: 16.0
        System.out.println("Addition of three doubles: " + calculator.add(5.5, 10.5, 15.5)); // Output: 31.5

        // Testing method overloading with one integer and one double
        System.out.println("Addition of one integer and one double: " + calculator.add(5, 10.5)); // Output: 15.5
        System.out.println("Addition of one double and one integer: " + calculator.add(5.5, 10)); // Output: 15.5
    }


}
