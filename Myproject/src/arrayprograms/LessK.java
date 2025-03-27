package arrayprograms;
import java.util.Scanner;
public class LessK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		


		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the number of elements: ");
		        int n = scanner.nextInt();

		        int[] numbers = new int[n];
		        System.out.println("Enter the elements:");
		        for (int i = 0; i < n; i++) {
		            numbers[i] = scanner.nextInt();
		        }

		        System.out.print("Enter the value of k: ");
		        int k = scanner.nextInt();

		        int count = 0;
		        for (int num : numbers) {
		            if (num > k) {
		                count++;
		            }
		        }

		        System.out.println("Count of numbers greater than " + k + " is: " + count);
		        scanner.close();
		   

	}

}
