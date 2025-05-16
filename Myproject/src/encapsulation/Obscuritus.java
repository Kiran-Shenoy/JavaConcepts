package encapsulation;
import java.util.Scanner;


class Zephyros {
    private String essence;
    private int magnitude;

    // Setter methods (mutators)
    public void setEssence(String essence) {
        this.essence = essence;
    }

    public void setMagnitude(int magnitude) {
        this.magnitude = magnitude;
    }

    // Getter methods (accessors)
    public String getEssence() {
        return essence;
    }

    public int getMagnitude() {
        return magnitude;
    }
}

public class Obscuritus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);
		        Zephyros object = new Zephyros();

		        System.out.print("Enter essence: ");
		        object.setEssence(scanner.nextLine());

		        System.out.print("Enter magnitude: ");
		        object.setMagnitude(scanner.nextInt());

		        System.out.println("\nEncapsulated Data:");
		        System.out.println("Essence: " + object.getEssence());
		        System.out.println("Magnitude: " + object.getMagnitude());

		        scanner.close();
		   
	}

}
