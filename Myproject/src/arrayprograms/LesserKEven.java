package arrayprograms;
import java.util.Scanner;
public class LesserKEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);

		        // Taking array size input
		        System.out.print("Enter the size of the array: ");
		        int n = scanner.nextInt();

		        // Taking array elements input
		        int[] arr = new int[n];
		        System.out.println("Enter " + n + " integers:");
		        for (int i = 0; i < n; i++) {
		            arr[i] = scanner.nextInt();
		        }

		        // Taking value of k as input
		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();

		        // Counting elements less than k and even
		        int count = 0;
		        for (int num : arr) {
		            if (num < k && num % 2 == 0) {
		                count++;
		            }
		        }

		        // Outputting the result
		        System.out.println("Count of elements less than " + k + " and even: " + count);

		        scanner.close();
		   

	}

}
