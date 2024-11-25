package Singleton;


//Singleton Logger Class
class Logger {
 // Static instance of Logger
 private static Logger loggerInstance;

 // Private constructor to prevent instantiation
 private Logger() {
     System.out.println("Logger Initialized.");
 }

 // Public method to provide access to the instance
 public static Logger getInstance() {
     if (loggerInstance == null) {
         loggerInstance = new Logger();
     }
     return loggerInstance;
 }

 


public class SingleLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 public void log(String message) {
		     System.out.println("Log: " + message);
		 
		     // Get the singleton logger instance
		     Logger logger1 = Logger.getInstance();
		     logger1.log("Application started.");

		     // Get the logger instance again
		     Logger logger2 = Logger.getInstance();
		     logger2.log("Application running.");

		     // Check if the same instance is used
		     System.out.println("Are both logger instances the same? " + (logger1 == logger2));

		 }
	}
