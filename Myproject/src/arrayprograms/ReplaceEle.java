package arrayprograms;
import java.util.Scanner;
public class ReplaceEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);

		        // Get array size
		        System.out.print("Enter the number of elements in the array: ");
		        int n = scanner.nextInt();

		        int[] arr = new int[n];

		        // Get array elements from user
		        System.out.println("Enter the elements of the array: ");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Get value of k
		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();

		        // Replace elements divisible by k
		        for (int i = 0; i < n; i++) {
		            if (arr[i] % k == 0) {
		                arr[i] = k;
		            }
		        }

		        // Print modified array
		        System.out.println("Modified array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }

		        scanner.close();
		   

	}

}
