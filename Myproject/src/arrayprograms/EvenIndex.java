package arrayprograms;
import java.util.Scanner;
public class EvenIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);

		        // Ask the user for the array size
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        // Create an array of the specified size
		        int[] array = new int[size];

		        // Take user input for array elements
		        System.out.println("Enter " + size + " elements:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        // Print elements at even indexes
		        System.out.println("Elements at even indexes:");
		        for (int i = 0; i < array.length; i++) {
		            if (i % 2 == 0) { // Check if the index is even
		                System.out.println("Index " + i + ": " + array[i]);
		            }
		        }

		        scanner.close();
		   

	}

}
