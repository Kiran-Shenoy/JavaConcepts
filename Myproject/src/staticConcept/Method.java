package staticConcept;
import java.util.Scanner;


public class Method {
	   // Static method to add two numbers
    static int addNumbers(int a, int b) {
        return a + b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		         Scanner scanner = new Scanner(System.in);

		        // User input
		        System.out.print("Enter first number: ");
		        int num1 = scanner.nextInt();
		        
		        System.out.print("Enter second number: ");
		        int num2 = scanner.nextInt();
		        
		        // Calling the static method
		        int result = addNumbers(num1, num2);
		        
		        System.out.println("Sum: " + result);
		        
		        scanner.close();
		 

	}

}
