package methodOverload;
import java.util.Scanner;
class TextProcessor {
    public void processInput(String input) {
        System.out.println("Processing text input: " + input);
    }
}

// Subclass overriding method to handle Morse code input
class MorseCodeProcessor extends TextProcessor {

    public void processInput(String input) {
        System.out.println("Decoding Morse code input: " + decodeMorse(input));
    }

    private String decodeMorse(String morse) {
        return morse.equals(".... . .-.. .-.. ---") ? "HELLO" : "UNKNOWN CODE";
    }
}
public class Ride {
	// Superclass
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter Morse Code:");
		        String userInput = scanner.nextLine();

		        TextProcessor processor = new MorseCodeProcessor(); // Polymorphism
		        processor.processInput(userInput);
		        
		        scanner.close();
		   
	}

}
