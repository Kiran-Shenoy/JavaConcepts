package multiThreading;
import java.util.Scanner;

class NumberPrinter extends Thread {
    int limit;

    NumberPrinter(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Printing numbers from 1 to " + limit);
        for (int i = 1; i <= limit; i++) {
            System.out.println("Number: " + i);
            try {
                Thread.sleep(500); // sleep for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}

class SquarePrinter extends Thread {
    int limit;

    SquarePrinter(int limit) {
        this.limit = limit;
    }

    public void run() {
        System.out.println("Printing squares from 1 to " + limit);
        for (int i = 1; i <= limit; i++) {
            System.out.println("Square of " + i + ": " + (i * i));
            try {
                Thread.sleep(700); // sleep for 0.7 seconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
public class MultiThraed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a positive number: ");
		        int limit = scanner.nextInt();

		        NumberPrinter numberThread = new NumberPrinter(limit);
		        SquarePrinter squareThread = new SquarePrinter(limit);

		        numberThread.start();
		        squareThread.start();
		    
	}

}
