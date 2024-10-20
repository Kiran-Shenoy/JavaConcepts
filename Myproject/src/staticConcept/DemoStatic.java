package staticConcept;


class Counters {
    // Static variable to keep track of count across all instances
    static int count = 0;

    // Constructor that increments the count when an object is created
    Counters() {
        count++;
    }

    // Static method to display the current value of the static variable
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}

     
public class DemoStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Counters obj1 = new Counters();
	        Counters obj2 = new Counters();
	        Counters obj3 = new Counters();

	        // Calling the static method to display the count
	        Counters.displayCount();  // Output: Total objects created: 3
	   
	}

}
