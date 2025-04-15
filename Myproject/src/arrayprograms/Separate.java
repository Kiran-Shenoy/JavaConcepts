package arrayprograms;
import java.util.Scanner;
import java.util.ArrayList;
public class Separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);

		        // Get array size from the user
		        System.out.print("Enter the number of elements: ");
		        int size = scanner.nextInt();

		        int[] arr = new int[size];
		        ArrayList<Integer> evenNumbers = new ArrayList<>();
		        ArrayList<Integer> oddNumbers = new ArrayList<>();

		        // Input elements into the array
		        System.out.println("Enter the elements:");
		        for (int i = 0; i < size; i++) {
		            arr[i] = scanner.nextInt();
		            if (arr[i] % 2 == 0) {
		                evenNumbers.add(arr[i]);
		            } else {
		                oddNumbers.add(arr[i]);
		            }
		        }

		        // Output the entered values
		        System.out.println("Entered elements: ");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();

		        // Output the separated even and odd numbers
		        System.out.println("Even numbers: " + evenNumbers);
		        System.out.println("Odd numbers: " + oddNumbers);

		        scanner.close();
		   

	}

}
