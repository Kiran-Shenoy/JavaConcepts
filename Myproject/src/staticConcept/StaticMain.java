package staticConcept;


class StaticExample {
    // Static variable
    static int count = 0;

    // Static method
    static void incrementCount() {
        count++;
    }

    // Non-static method
    void displayCount() {
        System.out.println("Current count: " + count);
    }
}


     

public class StaticMain {

	public static void main(String[] args) {
	
		 StaticExample.incrementCount();  // increment count by 1
	        StaticExample.incrementCount();  // increment count by 1 again
	        
	        // Creating an instance of the class to call the non-static method
	        StaticExample obj = new StaticExample();
	        obj.displayCount(); // This will print "Current count: 2"
	    }
	}
