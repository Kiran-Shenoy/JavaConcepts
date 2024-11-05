package Singleton;

class DatabaseConnection {
    // Static variable to hold the single instance
    private static DatabaseConnection instance = null;

    // Private constructor to restrict instantiation
    private DatabaseConnection() {
        System.out.println("Database connection established.");
    }

    // Static method to get the single instance of the class
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Example method for database operation
    public void connect() {
        System.out.println("Connecting to the database...");
    
    }
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DatabaseConnection connection1 = DatabaseConnection.getInstance();
        DatabaseConnection connection2 = DatabaseConnection.getInstance();

        // Check if both instances are the same
        if (connection1 == connection2) {
            System.out.println("Both connections are the same instance.");
        }

        // Calling method on singleton instance
        connection1.connect();
	}

}
