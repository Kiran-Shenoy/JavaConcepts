package Singleton;
import java.util.Scanner;

// Singleton class
class ConfigManager {
    private static ConfigManager instance;
    private String configValue;

    // Private constructor prevents instantiation from other classes
    private ConfigManager() {}

    // Static method to get the single instance
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public void setConfig(String value) {
        configValue = value;
    }

    public String getConfig() {
        return configValue;
    }
}

public class ConfigNameGenerate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		        Scanner scanner = new Scanner(System.in);

		        // User input
		        System.out.print("Enter your config value: ");
		        String userInput = scanner.nextLine();

		        // Accessing the singleton and setting the value
		        ConfigManager config = ConfigManager.getInstance();
		        config.setConfig(userInput);

		        // Retrieving the value from the singleton instance
		        System.out.println("Config value stored in singleton: " + config.getConfig());

		        scanner.close();
		    

	}

}
