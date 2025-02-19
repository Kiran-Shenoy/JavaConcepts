package collections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

    
   
public class Collect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // ArrayList Example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // Duplicate element

        System.out.println("ArrayList elements:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // HashSet Example
        HashSet<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Dog"); // Duplicate element

        System.out.println("\nHashSet elements:");
        for (String animal : animals) {
            System.out.println(animal);
        }

        // HashMap Example
        HashMap<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");

        System.out.println("\nHashMap elements:");
        for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Check if a key exists in the HashMap
        int keyToCheck = 2;
        if (numbers.containsKey(keyToCheck)) {
            System.out.println("\nHashMap contains key " + keyToCheck + ": " + numbers.get(keyToCheck));
        } else {
            System.out.println("\nHashMap does not contain key " + keyToCheck);
        }
	}

}
