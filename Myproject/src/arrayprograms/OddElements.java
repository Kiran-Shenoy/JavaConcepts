package arrayprograms;
import java.util.Scanner;
public class OddElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);
		        
		        // Get the size of the array
		        System.out.print("Enter the number of elements in the array: ");
		        int n = scanner.nextInt();
		        
		        int[] arr = new int[n];
		        
		        // Get user input for the array elements
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }
		        
		        // Display elements at odd indices
		        System.out.println("Elements at odd indices are:");
		        for (int i = 1; i < n; i += 2) { // odd indices are 1, 3, 5, etc.
		            System.out.println(arr[i]);
		        }
		        
		        scanner.close();
		   

	}

}
