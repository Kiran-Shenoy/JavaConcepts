package interfaces;
import java.util.Scanner;
//Defining an interface
		interface Cryptozoologist {
		    void studyMystery();
		}

		// Implementing the interface in a rare-named class
		class Quizzacious implements Cryptozoologist {
		    private String creature;

		    // Constructor to initialize the rare creature name
		    public Quizzacious(String creature) {
		        this.creature = creature;
		    }

		    // Implementing the interface method
		    @Override
		    public void studyMystery() {
		        System.out.println("Studying the elusive creature: " + creature);
		    }
		}
public class Crypto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Taking user input for a rare creature name
		        System.out.print("Enter the name of a mysterious creature: ");
		        String creatureName = scanner.nextLine();

		        // Creating an object with user input
		        Quizzacious obj = new Quizzacious(creatureName);
		        obj.studyMystery();

		        scanner.close();
		    
	}

}
