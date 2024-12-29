package multiThreading;

//Thread to print numbers
class NumberThread extends Thread {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("Number: " + i);
         try {
             Thread.sleep(500); // Pause for half a second
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }
 }
}

//Thread to print alphabets
class AlphabetThread extends Thread {
 public void run() {
     for (char ch = 'A'; ch <= 'E'; ch++) {
         System.out.println("Alphabet: " + ch);
         try {
             Thread.sleep(500); // Pause for half a second
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }
     }
  }
}

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // Create and start threads
	     NumberThread numbers = new NumberThread();
	     AlphabetThread alphabets = new AlphabetThread();

	     numbers.start();  // Start number printing thread
	     alphabets.start(); // Start alphabet printing thread

	}

}
