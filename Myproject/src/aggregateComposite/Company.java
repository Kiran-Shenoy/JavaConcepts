package aggregateComposite;
import java.util.Scanner;
public class Company {

	

	    // Method to calculate the average age of employees
	    public static double calculateAverageAge(int[] ages) {
	        int sum = 0;
	        for (int age : ages) {
	            sum += age;
	        }
	        return (double) sum / ages.length;
	    }

	  
	       

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scanner = new Scanner(System.in);

	        // Prompt user to enter the number of employees
	        System.out.print("Enter the number of employees: ");
	        int numberOfEmployees = scanner.nextInt();

	        // Array to store ages of employees
	        int[] ages = new int[numberOfEmployees];

	        // Loop to get the ages of all employees
	        System.out.println("Enter the ages of the employees:");
	        for (int i = 0; i < numberOfEmployees; i++) {
	            System.out.print("Enter age of employee " + (i + 1) + ": ");
	            ages[i] = scanner.nextInt();
	        }

	        // Calculate and print the average age
	        double averageAge = calculateAverageAge(ages);
	        System.out.println("The average age of the employees is: " + averageAge);

	        // Close the scanner
	        scanner.close();
	    }
	}