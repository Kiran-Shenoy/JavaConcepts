package Singleton;
// TODO Auto-generated method stub
import java.util.Scanner;

// Singleton class renamed to AppConfig
class AppConfig {
    // Single instance of AppConfig
    private static AppConfig instance;

    // Example configuration data
    private String configData;

    // Private constructor to prevent instantiation
    private AppConfig() {}

    // Public method to return the single instance
    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }

    // Setter method
    public void setConfigData(String data) {
        this.configData = data;
    }

    // Getter method
    public String getConfigData() {
        return configData;
    }
}
public class AppLauncher {

	public static void main(String[] args) {
	

		        Scanner scanner = new Scanner(System.in);

		        // Get Singleton instance of AppConfig
		        AppConfig config = AppConfig.getInstance();

		        // Take user input
		        System.out.print("Enter configuration data: ");
		        String input = scanner.nextLine();

		        // Set and print the config data
		        config.setConfigData(input);
		        System.out.println("Stored configuration: " + config.getConfigData());

		        // Get another reference to the Singleton
		        AppConfig anotherConfig = AppConfig.getInstance();
		        System.out.println("Accessed again: " + anotherConfig.getConfigData());

		        // Verify that both references point to the same instance
		        System.out.println("Are both references the same? " + (config == anotherConfig));

		        scanner.close();
		 

	}

}
