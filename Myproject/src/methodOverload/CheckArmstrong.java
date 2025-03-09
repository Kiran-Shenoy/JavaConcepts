package methodOverload;
import java.util.Scanner;

public class CheckArmstrong {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a positive integer: ");
	        int number = scanner.nextInt();

	        int product = calculateProductOfDigits(number);

	        if (isPrime(product)) {
	            System.out.println("Prime");
	        } else {
	            System.out.println("Not Prime");
	        }
	    }

	    public static int calculateProductOfDigits(int number) {
	        int product = 1;

	        while (number != 0) {
	            int digit = number % 10;
	            product *= digit;
	            number /= 10;
	        }

	        return product;
	    }

	    public static boolean isPrime(int number) {
	        if (number <= 1) {
	            return false;
	        }

	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}


