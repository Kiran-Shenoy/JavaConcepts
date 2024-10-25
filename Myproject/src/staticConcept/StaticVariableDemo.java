package staticConcept;

class Counters {
    // Static variable to keep track of the number of objects created
    static int count = 0;

    // Constructor increments the static count variable each time an object is created
    Counters() {
        count++;
    }

    // Static method to display the total count
    static void displayCount() {
        System.out.println("Total objects created: " + count);
    }
}


    

public class StaticVariableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // Creating objects
        Counters obj1 = new Counters();
        Counters obj2 = new Counters();
        Counters obj3 = new Counters();

        // Displaying the count of objects
        Counters.displayCount();  // Output: Total objects created: 3
    }
}
