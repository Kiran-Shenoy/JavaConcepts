package exceptionHandling;
// TODO Auto-generated method stub
import java.util.Scanner;
import java.util.InputMismatchException;

public class World {


	
				    private int number;

		    public void getUserInput() {
		        Scanner scanner = new Scanner(System.in);
		        boolean valid = false;

		        while (!valid) {
		            try {
		                System.out.print("Enter an integer: ");
		                number = scanner.nextInt();  // May throw InputMismatchException
		                valid = true;
		            } catch (InputMismatchException e) {
		                System.out.println("Oops! That's not a valid integer. Try again.");
		                scanner.next(); // Clear the invalid input
		            }
		        }
		    }

		    public void display() {
		        System.out.println("You entered: " + number);
		    }
		

		    public static void main(String[] args) {
		        World world = new World();
		        world.getUserInput();
		        world.display();
		    }
	
}
