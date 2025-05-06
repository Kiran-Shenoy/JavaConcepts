package aggregateComposite;
import java.util.Scanner;
public class CompoFunc {

	
		    public static int f(int x) {
		        return x + 2;
		    }

		    // Function g(x) = x * 3
		    public static int g(int x) {
		        return x * 3;
		    }

		    // Composite function h(x) = g(f(x))
		    public static int h(int x) {
		        return g(f(x));
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        // Get user input
		        System.out.print("Enter a number: ");
		        int input = scanner.nextInt();

		        // Compute the composite function
		        int result = h(input);
		        System.out.println("The result of h(x) = g(f(x)) is: " + result);

		        scanner.close();
		  
	}

}
