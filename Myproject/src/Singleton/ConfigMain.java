package Singleton;
import java.util.Scanner;

// Singleton class
class Config {
    private static Config instance;
    private String setting;

    // Private constructor
    private Config() {}

    // Public method to get the single instance
    public static Config getInstance() {
        if (instance == null) {
            instance = new Config();
        }
        return instance;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }

    public String getSetting() {
        return setting;
    }
}
public class ConfigMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Get singleton instance
		        Config config = Config.getInstance();

		        // Take input from user
		        System.out.print("Enter configuration setting: ");
		        String userInput = scanner.nextLine();

		        // Set in singleton
		        config.setSetting(userInput);

		        // Show the result
		        System.out.println("You set the config to: " + config.getSetting());
		

	}

}
