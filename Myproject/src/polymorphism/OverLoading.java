package polymorphism;

class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
}


public class OverLoading {

	public static void main(String[] args) {
		 Calculator calculator = new Calculator();

	        // Calling different overloaded methods
	        System.out.println("Sum of two integers: " + calculator.add(5, 10));
	        System.out.println("Sum of three integers: " + calculator.add(3, 7, 9));
	        System.out.println("Sum of two doubles: " + calculator.add(2.5, 3.8));
	    }
}
