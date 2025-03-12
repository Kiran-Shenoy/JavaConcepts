package arrayprograms;
import java.util.Scanner;

public class FloatElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        // Input array size
		        System.out.print("Enter the number of float elements (n): ");
		        int n = scanner.nextInt();

		        // Initialize float array
		        float[] a = new float[n];

		        System.out.println("Enter " + n + " float elements:");
		        for (int i = 0; i < n; i++) {
		            a[i] = scanner.nextFloat();
		        }

		        // Print the float array
		        System.out.println("You entered:");
		        for (int i = 0; i < n; i++) {
		            System.out.println(a[i]);
		        }

		        scanner.close();
		  

	}

}
