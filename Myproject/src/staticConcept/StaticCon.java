package staticConcept;


class MathUtils {
    // Static variable
    static int counter = 0;

    // Static method
    static int add(int a, int b) {
        counter++; // Increment counter each time the method is called
        return a + b;
    }

    // Static block
    static {
        System.out.println("Static block executed. Initial counter value: " + counter);
 
         }
}

public class StaticCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // Calling the static method without creating an object
        System.out.println("Sum: " + MathUtils.add(5, 10));
        System.out.println("Sum: " + MathUtils.add(20, 30));

        // Accessing the static variable directly
        System.out.println("Static method called " + MathUtils.counter + " times.");

	}

}
