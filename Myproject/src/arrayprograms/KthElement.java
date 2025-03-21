package arrayprograms;
import java.util.Scanner;
public class KthElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);

		        // Input array size
		        System.out.print("Enter the size of the array: ");
		        int n = scanner.nextInt();

		        int[] arr = new int[n];

		        // Input array elements
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Input k
		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();

		        // Sort the array in descending order (manually)
		        for (int i = 0; i < n - 1; i++) {
		            for (int j = i + 1; j < n; j++) {
		                if (arr[i] < arr[j]) {
		                    // Swap arr[i] and arr[j]
		                    int temp = arr[i];
		                    arr[i] = arr[j];
		                    arr[j] = temp;
		                }
		            }
		        }

		        // Output the k-th largest element
		        if (k <= n) {
		            System.out.println(k + "th largest element is: " + arr[k - 1]);
		        } else {
		            System.out.println("Invalid value of k!");
		        }

		        scanner.close();
		   

	}

}
