package staticConcept;


class Calculator {
    // Static variable
    static int callCount = 0;

    // Static block
    static {
        System.out.println("Static block executed: Calculator class loaded.");
    }

    // Static method
    static int add(int a, int b) {
        callCount++;
        return a + b;
    }

    // Instance method for comparison
    int multiply(int a, int b) {
        return a * b;
    }

    // Method to get call count
    static int getCallCount() {
        return callCount;
     }
}

public class StaticExample {

	public static void main(String[] args) {

        System.out.println("Sum: " + Calculator.add(5, 10));
        System.out.println("Sum: " + Calculator.add(15, 20));

        // Using instance method for comparison
        Calculator calc = new Calculator();
        System.out.println("Product: " + calc.multiply(3, 4));

        // Accessing static variable
        System.out.println("Static method called " + Calculator.getCallCount() + " times.");
 
	}

}
