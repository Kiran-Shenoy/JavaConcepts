package encapsulation;
import java.util.Scanner;

// Encapsulated class
class Signal {
    private String color;
    private int duration;

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Getter for duration
    public int getDuration() {
        return duration;
    }

    // Setter for duration
    public void setDuration(int duration) {
        if (duration > 0) {
            this.duration = duration;
        } else {
            System.out.println("Duration must be positive.");
        }
    }
}
public class SignalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);
		        Signal signal = new Signal();

		        System.out.print("Enter signal color: ");
		        String color = scanner.nextLine();
		        signal.setColor(color);

		        System.out.print("Enter signal duration (in seconds): ");
		        int duration = scanner.nextInt();
		        signal.setDuration(duration);

		        System.out.println("\nSignal Details:");
		        System.out.println("Color: " + signal.getColor());
		        System.out.println("Duration: " + signal.getDuration() + " seconds");
		   
	}

}
