package arrayprograms;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);

		        // Get the size of the array
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();

		        // Initialize the array and get user input
		        int[] array = new int[size];
		        System.out.println("Enter " + size + " elements of the array:");
		        for (int i = 0; i < size; i++) {
		            array[i] = scanner.nextInt();
		        }

		        // Reverse the array
		        System.out.println("Array in reverse order:");
		        for (int i = size - 1; i >= 0; i--) {
		            System.out.print(array[i] + " ");
		        }


	}

}
