package arrayprograms;
import java.util.Scanner;

public class PrintEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		   
		        Scanner scanner = new Scanner(System.in);
		        
		        // Ask the user for the number of elements
		        System.out.println("Enter the number of elements in the array:");
		        int n = scanner.nextInt();
		        
		        // Initialize the array
		        int[] array = new int[n];
		        
		        // Take user input for each element
		        System.out.println("Enter the elements of the array:");
		        for (int i = 0; i < n; i++) {
		            array[i] = scanner.nextInt();
		        }
		        
		        // Print the elements of the array
		        System.out.println("Array elements are:");
		        for (int element : array) {
		            System.out.println(element);
		        }
		        
		        scanner.close();

	}

}
