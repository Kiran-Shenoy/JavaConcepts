package multiThreading;
import java.util.Scanner;

// Thread to take user input
class InputThreads extends Thread {
    public String input;

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        input = scanner.nextLine();
        System.out.println("Input received: " + input);
    }
}

// Thread to process the input (mock processing)
class ProcessingThread extends Thread {
    private String data;

    public ProcessingThread(String data) {
        this.data = data;
    }

    public void run() {
        try {
            Thread.sleep(1000); // Simulate processing delay
        } catch (InterruptedException e) {
            System.out.println("Processing interrupted.");
        }
        System.out.println("Processing completed: " + data.toUpperCase());
    }
}

public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        InputThreads inputThread = new InputThreads();
		        inputThread.start();

		        try {
		            inputThread.join(); // Wait for inputThread to finish
		        } catch (InterruptedException e) {
		            System.out.println("Main thread interrupted.");
		        }

		        ProcessingThread processingThread = new ProcessingThread(inputThread.input);
		        processingThread.start();
	

	}

}
