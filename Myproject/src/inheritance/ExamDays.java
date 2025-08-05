package inheritance;
// TODO Auto-generated method stub
import java.util.Scanner;

// Base class
class Days {
    int numberOfDays;

    public void setNumberOfDays(int num) {
        numberOfDays = num;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}

// Derived class
class NamedDays extends Days {
    String[] dayNames;

    public void setDayNames(String[] names) {
        dayNames = names;
    }

    public void displayDays() {
        System.out.println("You entered " + numberOfDays + " days:");
        for (int i = 0; i < numberOfDays; i++) {
            System.out.println("Day " + (i + 1) + ": " + dayNames[i]);
        }
    }
}

// Main class
public class ExamDays {

	public static void main(String[] args) {
	
	
		        Scanner scanner = new Scanner(System.in);
		        NamedDays nd = new NamedDays();

		        System.out.print("Enter number of days: ");
		        int num = scanner.nextInt();
		        scanner.nextLine(); // Consume newline

		        nd.setNumberOfDays(num);

		        String[] names = new String[num];
		        for (int i = 0; i < num; i++) {
		            System.out.print("Enter name for day " + (i + 1) + ": ");
		            names[i] = scanner.nextLine();
		        }

		        nd.setDayNames(names);
		        nd.displayDays();

		        scanner.close();
		   
	}

}
