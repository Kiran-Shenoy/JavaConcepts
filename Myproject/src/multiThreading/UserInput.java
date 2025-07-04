package multiThreading;
//TODO Auto-generated method stub
		import java.util.Scanner;

		// Thread class 1: Calculates the square of a number
		class SquareThread extends Thread {
		    private int number;

		    public SquareThread(int number) {
		        this.number = number;
		    }

		    public void run() {
		        System.out.println("Square of " + number + ": " + (number * number));
		    }
		}

		// Thread class 2: Converts a string to uppercase
		class UpperCaseThread extends Thread {
		    private String text;

		    public UpperCaseThread(String text) {
		        this.text = text;
		    }

		    public void run() {
		        System.out.println("Uppercase version of '" + text + "': " + text.toUpperCase());
		    }
		}

public class UserInput {

	public static void main(String[] args) {
		
		// Main class
		        Scanner scanner = new Scanner(System.in);

		        // Take integer input
		        System.out.print("Enter a number: ");
		        int number = scanner.nextInt();
		        scanner.nextLine(); // Consume newline character

		        // Take string input
		        System.out.print("Enter a string: ");
		        String text = scanner.nextLine();

		        // Create and start threads
		        SquareThread squareThread = new SquareThread(number);
		        UpperCaseThread upperCaseThread = new UpperCaseThread(text);

		        squareThread.start();
		        upperCaseThread.start();
		    }
		

}
