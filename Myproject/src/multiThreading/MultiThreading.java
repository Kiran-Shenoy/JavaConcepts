package multiThreading;
import java.util.Scanner;

class InputThread extends Thread {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "! Welcome to multithreading.");
        scanner.close();
    }
}

class MessageThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Message from a separate thread: " + (i + 1));
            try {
                Thread.sleep(1000); // Pause for a second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
    }
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        InputThread inputThread = new InputThread();
		        MessageThread messageThread = new MessageThread();

		        inputThread.start();
		        messageThread.start();
		    
	}

}
