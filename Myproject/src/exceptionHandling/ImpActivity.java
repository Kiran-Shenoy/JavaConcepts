package exceptionHandling;
import java.util.Scanner;

class Activity {
    private String name;
    private int duration; // in minutes

    public Activity(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public void display() {
        System.out.println("Activity: " + name);
        System.out.println("Duration: " + duration + " minutes");
    }
}

public class ImpActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        try {
		            System.out.print("Enter activity name: ");
		            String name = scanner.nextLine();

		            System.out.print("Enter duration in minutes: ");
		            int duration = Integer.parseInt(scanner.nextLine());

		            if (duration <= 0) {
		                throw new IllegalArgumentException("Duration must be positive.");
		            }

		            Activity activity = new Activity(name, duration);
		            activity.display();

		        } catch (NumberFormatException e) {
		            System.out.println("Invalid input! Please enter a valid number for duration.");
		        } catch (IllegalArgumentException e) {
		            System.out.println("Error: " + e.getMessage());
		        } catch (Exception e) {
		            System.out.println("Unexpected error occurred: " + e.getMessage());
		        } finally {
		            scanner.close();
		            System.out.println("Program ended.");
		        }
		 

	}

}
