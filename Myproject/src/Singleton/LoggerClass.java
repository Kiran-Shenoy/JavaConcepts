package Singleton;

//Singleton class
public class Logger {
 // Private static instance of Logger, initially set to null
 private static Logger instance = null;

 // Private constructor to prevent instantiation from other classes
 private Logger() {
     System.out.println("Logger initialized.");
 }

 // Public method to provide global access to the instance
 public static Logger getInstance() {
     if (instance == null) {
         instance = new Logger();
     }
     return instance;
 }

 public void log(String message) {
     System.out.println("Log: " + message);
 }
}


public class LoggerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
	     // Get the single instance of Logger
	     Logger logger1 = Logger.getInstance();
	     logger1.log("This is the first log message.");

	     // Try to get another instance
	     Logger logger2 = Logger.getInstance();
	     logger2.log("This is the second log message.");

	     // Check if both instances are the same
	     System.out.println("logger1 and logger2 are the same instance: " + (logger1 == logger2));

	}

}
