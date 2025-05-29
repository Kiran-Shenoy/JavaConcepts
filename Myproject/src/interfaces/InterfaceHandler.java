package interfaces;
import java.util.Scanner;

// Define an interface
interface InputHandler {
    void takeInput();
}

// Implement the interface in a class
class UserInput implements InputHandler {
    private String data;

    @Override
    public void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some text: ");
        data = scanner.nextLine();
        System.out.println("You entered: " + data);
        scanner.close();
    }
}
public class InterfaceHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        InputHandler inputHandler = new UserInput();
		        inputHandler.takeInput();
		    }
		

}
