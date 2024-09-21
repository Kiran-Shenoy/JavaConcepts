package staticConcept;



class Counter {
    // Static variable, shared among all instances
    static int count = 0;

    // Constructor
    Counter() {
        // Increment static variable
        count++;
        System.out.println("Counter: " + count);
    }
}


        
  

public class StaticVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter obj1 = new Counter();  // Counter: 1
        Counter obj2 = new Counter();  // Counter: 2
        Counter obj3 = new Counter();  // Counter: 3

        // Accessing the static variable directly using the class name
        System.out.println("Total objects created: " + Counter.count);
	}

}
