package Singleton;


//Singleton Class: DatabaseConnection
class DatabaseConection {
 // Static variable to hold the single instance of the class
 private static DatabaseConection instance;

 // Private constructor to restrict instantiation from other classes
 private DatabaseConection() {
     System.out.println("Database Connection Initialized.");
 }

 // Static method to provide the single instance of the class
 public static DatabaseConection getInstance() {
     if (instance == null) {
         instance = new DatabaseConection();
     }
     return instance;
 }

 // Example method to demonstrate functionality
 public void connect() {
     System.out.println("Connected to the database.");
 }

 public void disconnect() {
     System.out.println("Disconnected from the database.");

 }
}


public class Singlexamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     // Attempt to create multiple instances
	     DatabaseConection db1 = DatabaseConection.getInstance();
	     DatabaseConection db2 = DatabaseConection.getInstance();

	     // Use the instance to call methods
	     db1.connect();
	     db2.disconnect();

	     // Check if both references point to the same instance
	     System.out.println("Are db1 and db2 the same instance? " + (db1 == db2));

	}

}
