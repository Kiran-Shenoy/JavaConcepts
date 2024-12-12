package multiThreading;

//Thread class extending Thread
class PrintNumbers extends Thread {
 private int start;

 public PrintNumbers(int start) {
     this.start = start;
 }

 @Override
 public void run() {
     for (int i = start; i < start + 5; i++) {
         System.out.println(Thread.currentThread().getName() + " - " + i);
         try {
             Thread.sleep(500); // Pause for 500ms
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 }
}

//Runnable implementation
class PrintMessages implements Runnable {
 @Override
 public void run() {
     String[] messages = {"Hello", "Welcome", "To", "Multithreading"};
     for (String message : messages) {
         System.out.println(Thread.currentThread().getName() + " - " + message);
         try {
             Thread.sleep(700); // Pause for 700ms
         } catch (InterruptedException e) {
             System.out.println("Thread interrupted: " + e.getMessage());
         }
     }
 
   }
}

public class MultiExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Create threads using Thread class
	     Thread thread1 = new PrintNumbers(1);
	     Thread thread2 = new PrintNumbers(10);

	     // Create threads using Runnable
	     Runnable printMessages = new PrintMessages();
	     Thread thread3 = new Thread(printMessages);

	     // Start threads
	     thread1.start();
	     thread2.start();
	     thread3.start();

	     // Main thread work
	     System.out.println(Thread.currentThread().getName() + " - Main thread is running");

	}

}
