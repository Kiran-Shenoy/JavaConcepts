package Singleton;

class Singleton1 {
    
    // Step 1: Create a private static instance of the class
    private static Singleton instance;
    
    // Step 2: Make the constructor private to prevent instantiation
    private Singleton1() {
        // Private constructor to prevent instantiation from outside
    }
    
    // Step 3: Provide a public static method to get the instance of the class
    public static Singleton getInstance() {
        if (instance == null) {
            // If no instance is created yet, create a new one
            instance = new Singleton();
        }
        return instance;
    }
}

public class Singleton {
    public static void main(String[] args) {
        // Step 4: Access the Singleton instance
        Singleton singleton1 = Singleton1.getInstance();
        Singleton singleton2 = Singleton1.getInstance();
        
        // Both instances should be the same
        System.out.println(singleton1 == singleton2); // Output: true
    }

	

}
