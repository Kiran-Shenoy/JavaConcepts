package arrayprograms;
import java.util.Scanner;
public class ReplaceEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


		        Scanner scanner = new Scanner(System.in);
		        
		        // Taking array size input
		        System.out.print("Enter the size of the array: ");
		        int size = scanner.nextInt();
		        
		        int[] arr = new int[size];
		        
		        // Taking array elements input
		        System.out.println("Enter the array elements:");
		        for (int i = 0; i < size; i++) {
		            arr[i] = scanner.nextInt();
		        }
		        
		        // Replacing even elements with -1
		        for (int i = 0; i < size; i++) {
		            if (arr[i] % 2 == 0) {
		                arr[i] = -1;
		            }
		        }
		        
		        // Displaying the modified array
		        System.out.println("Modified array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        
		        scanner.close();
		    

	}

}
