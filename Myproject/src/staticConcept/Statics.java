package staticConcept;
import java.util.Scanner;
public class Statics {

	

		    // Static variable
		    static int count = 0;

		    // Static method
		    static void incrementCount() {
		        count++;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number: ");
		        int num = scanner.nextInt();

		        // Static method call
		        incrementCount();

		        System.out.println("You entered: " + num);
		        System.out.println("Static count value: " + count);

		        scanner.close();
		  

	}

}
