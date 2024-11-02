package Singleton;

//Logger Singleton Class
class Logger {
 // Private static instance
 private static Logger instance;
 
 // Private constructor to prevent instantiation
 private Logger() {
 }
 
 // Public static method to get the single instance
 public static Logger getInstance() {
     if (instance == null) {
         instance = new Logger();
     }
     return instance;
 }
 
 // Method to log messages
 public void log(String message) {
     System.out.println("Log message: " + message);
 

 }
}


public class LoggerSingleton {

	public static void main(String[] args) {
		
		     // Get the singleton instance of Logger
		     Logger logger = Logger.getInstance();
		     
		     // Use the logger instance to log messages
		     logger.log("Application started.");
		     logger.log("User logged in.");
		     logger.log("Application finished.");
	}

}
