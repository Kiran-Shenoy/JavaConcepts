package Singleton;

//Singleton Class
class DatabaseeConnection {
 // Private static variable of the same class
 private static DatabaseeConnection instance;

 // Private constructor to restrict instantiation
 private DatabaseeConnection() {
     System.out.println("DatabaseConnection object created!");
 }

 // Public static method to provide access to the instance
 public static DatabaseeConnection getInstance() {
     if (instance == null) {
         instance = new DatabaseeConnection();
     }
     return instance;
 }

 // Example method
 public void connect() {
     System.out.println("Connected to the database.");
 }

 public void disconnect() {
     System.out.println("Disconnected from the database.");
 }
}

public class SingleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // Get the single instance of DatabaseConnection
	     DatabaseeConnection db1 = DatabaseeConnection.getInstance();
	     db1.connect();

	     // Try getting the instance again
	     DatabaseeConnection db2 = DatabaseeConnection.getInstance();
	     db2.disconnect();

	     // Verify that both instances are the same
	     System.out.println("Are both instances the same? " + (db1 == db2));
	 
	}

}
