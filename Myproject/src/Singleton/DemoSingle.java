package Singleton;

//Singleton Class
class DatabaseConnection {
 // Static variable to hold the single instance of the class
 private static DatabaseConnection instance;

 // Private constructor to prevent instantiation
 private DatabaseConnection() {
     System.out.println("Database Connection created.");
 }

 // Public method to provide access to the instance
 public static DatabaseConnection getInstance() {
     if (instance == null) {
         instance = new DatabaseConnection();
     }
     return instance;
 }

 // Method to simulate some functionality
 public void connect() {
     System.out.println("Connected to the database.");

    }
}


public class DemoSingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Get the single instance of DatabaseConnection
	     DatabaseConnection connection1 = DatabaseConnection.getInstance();
	     connection1.connect();

	     // Get the same instance again
	     DatabaseConnection connection2 = DatabaseConnection.getInstance();
	     connection2.connect();

	     // Check if the instances are the same
	     System.out.println("Are both instances the same? " + (connection1 == connection2));

	}

}
