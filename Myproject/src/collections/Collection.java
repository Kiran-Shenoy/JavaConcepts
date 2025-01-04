package collections;
import java.util.ArrayList;
import java.util.Collections;


      

public class Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Sorting the list
        Collections.sort(names);

        // Displaying the list
        System.out.println("Sorted List: " + names);

        // Removing an element
        names.remove("Bob");
        System.out.println("After Removal: " + names);

        // Checking if an element exists
        System.out.println("Contains Alice? " + names.contains("Alice"));
    }
}