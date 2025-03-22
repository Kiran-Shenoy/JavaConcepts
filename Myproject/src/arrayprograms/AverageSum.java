package arrayprograms;
// TODO Auto-generated method stub
import java.util.Arrays;
import java.util.Scanner;
public class AverageSum {

	public static void main(String[] args) {
	


		        Scanner scanner = new Scanner(System.in);

		        // Ask the user for the array size
		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        if (n < 3) {
		            System.out.println("Array size must be at least 3 to exclude largest and smallest elements.");
		            return;
		        }

		        double[] array = new double[n];
		        double sum = 0;

		        // Get user input for array elements
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            array[i] = scanner.nextDouble();
		            sum += array[i];
		        }

		        // Sort the array to find smallest and largest elements
		        Arrays.sort(array);
		        double smallest = array[0];
		        double largest = array[n - 1];

		        // Calculate the sum excluding the smallest and largest elements
		        sum -= (smallest + largest);

		        // Calculate the average
		        double average = sum / (n - 2);

		        // Print the result with 2 decimal places
		        System.out.printf("The average value excluding the largest and smallest elements is: %.2f%n", average);
		   

	}

}
