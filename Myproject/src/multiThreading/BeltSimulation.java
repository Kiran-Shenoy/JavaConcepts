package multiThreading;
import java.util.Scanner;

// Belt1 class extending Thread
class Belt1 extends Thread {
    private String item;

    public Belt1(String item) {
        this.item = item;
    }

    public void run() {
        System.out.println("🔵 Belt1 is processing item: " + item);
        try {
            Thread.sleep(1000); // Simulate processing time
        } catch (InterruptedException e) {
            System.out.println("Belt1 interrupted.");
        }
        System.out.println("🔵 Belt1 finished processing: " + item);
    }
}

// Belt2 class extending Thread
class Belt2 extends Thread {
    private String item;

    public Belt2(String item) {
        this.item = item;
    }

    public void run() {
        System.out.println("🟢 Belt2 is processing item: " + item);
        try {
            Thread.sleep(1200); // Simulate processing time
        } catch (InterruptedException e) {
            System.out.println("Belt2 interrupted.");
        }
        System.out.println("🟢 Belt2 finished processing: " + item);
    }
}

public class BeltSimulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter item for Belt1: ");
		        String item1 = scanner.nextLine();

		        System.out.print("Enter item for Belt2: ");
		        String item2 = scanner.nextLine();

		        // Create thread objects
		        Belt1 belt1 = new Belt1(item1);
		        Belt2 belt2 = new Belt2(item2);

		        // Start threads
		        belt1.start();
		        belt2.start();

		        // Wait for both threads to finish
		        try {
		            belt1.join();
		            belt2.join();
		        } catch (InterruptedException e) {
		            System.out.println("Main thread interrupted.");
		        }

		        System.out.println("✅ All belts have finished processing.");
		        scanner.close();
		   
	}

}
