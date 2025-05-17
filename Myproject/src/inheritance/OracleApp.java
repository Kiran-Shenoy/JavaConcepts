package inheritance;
import java.util.Random;
import java.util.Scanner;

class ObsidianOracle {
    private String[] predictions = {
        "You will achieve greatness soon.",
        "A mystery awaits you around the corner.",
        "Unexpected joy is heading your way!",
        "Beware of distractions that lead you astray.",
        "A new opportunity will present itself.",
        "Today is a good day to start something new.",
        "The stars are aligned in your favor.",
        "Trust your instincts, they will guide you well."
    };

    public String getPrediction() {
        Random random = new Random();
        return predictions[random.nextInt(predictions.length)];
    }
}
public class OracleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);
		        ObsidianOracle oracle = new ObsidianOracle();

		        System.out.print("Enter your name: ");
		        String name = sc.nextLine();

		        System.out.println("\nHello, " + name + "! The Obsidian Oracle speaks...");
		        System.out.println(oracle.getPrediction());

		        sc.close();
		    
	}

}
