package Singleton;


class Loggerr {
    // Static instance variable (only one instance of Logger)
    private static Loggerr loggerInstance;

    // Private constructor to restrict instantiation
    private Loggerr() {
        System.out.println("Logger initialized.");
    }

    // Public static method to provide access to the single instance
    public static Loggerr getInstance() {
        if (loggerInstance == null) {
            loggerInstance = new Loggerr(); // Lazy initialization
        }
        return loggerInstance;
    }

    // Method to log a message
    public void log(String message) {
        System.out.println("LOG: " + message);
   
          }
    }


public class LogExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     // Accessing the singleton instance
        Loggerr logger1 = Loggerr.getInstance();
        logger1.log("First log message.");

        // Trying to get another instance
        Loggerr logger2 = Loggerr.getInstance();
        logger2.log("Second log message.");

        // Verifying that both instances are the same
        if (logger1 == logger2) {
            System.out.println("Both are the same Logger instance.");
 
	}

}
}
