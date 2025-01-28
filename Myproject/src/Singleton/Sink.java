package Singleton;

public class Singletont {
    // Static variable to hold the single instance of the Singleton class
    private static Singletont singleInstance = null;

    // Private constructor to prevent instantiation
    private Singletont() {
        // Initialization code here
    }

    // Public static method to provide access to the instance
    public static Singletont getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singletont();
        }
        return singleInstance;
    }

    // Method to demonstrate functionality
    public void showMessage() {
        System.out.println("Hello from the Singleton instance!");
       }
}

public class Sink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Get the only instance of the Singleton class
        Singletont singleton = Singletont.getInstance();

        // Call a method on the Singleton instance
        singleton.showMessage();
 
	}

}
