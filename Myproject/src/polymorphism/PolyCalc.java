package polymorphism;

class Calculator {
    // Method with two parameters
    int add(int a, int b) {
        return a + b;
    }

    // Overloaded method with three parameters
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method with double parameters
    double add(double a, double b) {
        return a + b;
   
       }
}

public class PolyCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calculator calc = new Calculator();
        
        System.out.println("Sum of 2 integers: " + calc.add(5, 10));
        System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
        System.out.println("Sum of 2 doubles: " + calc.add(5.5, 2.3));
 
	}

}
