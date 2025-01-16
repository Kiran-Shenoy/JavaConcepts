package arrayprograms;
import java.util.Scanner;
public class StdName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);
		        
		        int n = scanner.nextInt();
		        scanner.nextLine(); // Consume the newline

		        String[] studentNames = new String[n];

		        for (int i = 0; i < n; i++) {
		            studentNames[i] = scanner.nextLine().trim(); // Trim any extra whitespace
		        }

		        for (int i = 0; i < n; i++) {
		            System.out.println("Student at index " + i + " is: " + studentNames[i]);
		        }

		        scanner.close();
		    }
		

	}


