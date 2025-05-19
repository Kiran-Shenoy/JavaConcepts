package encapsulation;
import java.util.Scanner;

// Encapsulated class with a rare name
class ZephyrCodex {
    private String secretCode;

    // Setter method to modify private variable
    public void setSecretCode(String secretCode) {
        this.secretCode = secretCode;
    }

    // Getter method to access private variable
    public String getSecretCode() {
        return secretCode;
    }
}

public class Arcane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        ZephyrCodex codex = new ZephyrCodex();

		        System.out.print("Enter a secret code: ");
		        String userCode = scanner.nextLine();
		        
		        codex.setSecretCode(userCode);

		        System.out.println("Your stored secret code is: " + codex.getSecretCode());

		        scanner.close();
		    }
		

}
