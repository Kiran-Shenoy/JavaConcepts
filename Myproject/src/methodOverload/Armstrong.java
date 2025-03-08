package methodOverload;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the value of N: ");
		        int N = scanner.nextInt();
		        
		        for (int num = 1; num <= N; num++) {
		            int number = num;
		            int sum = 0;
		            int digits = String.valueOf(num).length();
		            
		            while (number != 0) {
		                int digit = number % 10;
		                sum += Math.pow(digit, digits);
		                number /= 10;
		            }
		            
		            if (sum == num) {
		                System.out.println(num + " is an Armstrong number.");
		            }
		        }
		        
		        scanner.close();
		   

	}

}
