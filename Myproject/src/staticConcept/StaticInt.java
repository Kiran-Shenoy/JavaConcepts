package staticConcept;
import java.util.Scanner;
public class StaticInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        // Create a Scanner object for user input
		        Scanner scanner = new Scanner(System.in);

		        // Ask for user input
		        System.out.print("Enter your name: ");
		        String name = scanner.nextLine();

		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();

		        // Display the input
		        System.out.println("Hello, " + name + "! You are " + age + " years old.");

		        // Close the scanner
		        scanner.close();
		    

	}

}
