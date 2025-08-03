package Singleton;
import java.util.Scanner;

class Login {
    private static Login instance;
    private String username;

    // Private constructor to prevent instantiation
    private Login() {}

    // Public method to provide access to the instance
    public static Login getInstance() {
        if (instance == null) {
            instance = new Login();
        }
        return instance;
    }

    // Set the username
    public void setUsername(String username) {
        this.username = username;
    }

    // Get the username
    public String getUsername() {
        return username;
    }
}

public class UserLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Get the singleton instance
		        Login login = Login.getInstance();

		        System.out.print("Enter your username: ");
		        String user = scanner.nextLine();

		        login.setUsername(user);

		        System.out.println("Logged in as: " + login.getUsername());

		        // Demonstrate that it's the same instance
		        Login anotherLogin = Login.getInstance();
		        System.out.println("Accessing from another reference: " + anotherLogin.getUsername());

		        scanner.close();
		   
	}

}
