package Singleton;

public class WiFi {
	   // Static variable to hold the single instance
    private static WiFi instance;

    // Private constructor so no one else can instantiate it
    private WiFi() {
        System.out.println("WiFi connection initialized.");
    }

    // Public method to provide access to the instance
    public static WiFi getInstance() {
        if (instance == null) {
            instance = new WiFi();
        }
        return instance;
    }

    // Example method
    public void connect() {
        System.out.println("Connected to WiFi!");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 
		  
		        WiFi network1 = WiFi.getInstance();
		        WiFi network2 = WiFi.getInstance();

		        network1.connect();

		        System.out.println("Are both references the same? " + (network1 == network2));
		    }

}
