package arrayprograms;
import java.util.Scanner;

public class OddString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        Scanner scanner = new Scanner(System.in);

		        // Get array size from user
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        // Ensure the size constraint is met
		        if (size < 1 || size > 100000) {
		            System.out.println("Array size out of bounds!");
		            return;
		        }

		        int[] array = new int[size];

		        // Get array elements from user
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();

		            // Ensure the element value constraints are met
		            if (array[i] < -1000000000 || array[i] > 1000000000) {
		                System.out.println("Array element out of bounds!");
		                return;
		            }
		        }

		        System.out.println("Elements at odd indices are:");
		        // Output elements at odd indices efficiently
		        StringBuilder result = new StringBuilder();
		        for (int i = 1; i < size; i += 2) {
		            result.append(array[i]).append(" ");
		        }

		        System.out.println(result.toString().trim());
		   

	}

}
