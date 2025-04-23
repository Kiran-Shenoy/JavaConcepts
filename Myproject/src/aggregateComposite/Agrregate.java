package aggregateComposite;
// TODO Auto-generated method stub
import java.util.Scanner;
public class Agrregate {

	public static void main(String[] args) {

		        Scanner scanner = new Scanner(System.in);
		        int sum = 0, count = 0;
		        
		        System.out.println("Enter numbers to aggregate (type -1 to stop):");

		        while (true) {
		            int num = scanner.nextInt();
		            if (num == -1) {
		                break; // Exit the loop when user enters -1
		            }
		            sum += num;
		            count++;
		        }
		        
		        scanner.close();

		        if (count > 0) {
		            double average = (double) sum / count;
		            System.out.println("Sum: " + sum);
		            System.out.println("Average: " + average);
		        } else {
		            System.out.println("No numbers entered.");
		        }
		   
	}

}
