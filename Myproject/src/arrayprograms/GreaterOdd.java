package arrayprograms;
import java.util.Scanner;
public class GreaterOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);
		        
		        // Taking user input for the size of the array
		        System.out.print("Enter the size of the array: ");
		        int n = scanner.nextInt();
		        
		        int[] array = new int[n];
		        
		        // Taking user input for array elements
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            array[i] = scanner.nextInt();
		        }
		        
		        // Taking user input for the value of k
		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();
		        
		        // Counting elements greater than k and odd
		        int count = 0;
		        for (int num : array) {
		            if (num > k && num % 2 != 0) {
		                count++;
		            }
		        }
		        
		        System.out.println("Count of odd elements greater than " + k + ": " + count);
		        scanner.close();
		  

	}

}
