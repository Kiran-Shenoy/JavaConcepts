package Singleton;


class Logger {
    // Step 1: Create a private static instance of the class
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation from outside
    private Logger() {
        System.out.println("Logger initialized.");
    }

    // Step 3: Public static method to provide the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Method to log a message
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}

public class LoggerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Logger logger1 = Logger.getInstance();
        logger1.log("Application started.");

        // Get the instance again (same instance)
        Logger logger2 = Logger.getInstance();
        logger2.log("Application running.");

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (logger1 == logger2));
    

	}

}
