package methodOverload;
import java.util.Scanner;

class A {
    void display(String message) {
        System.out.println("Class A: " + message);
    }
}

class B {
    void display(int number) {
        System.out.println("Class B: " + number);
    }
}

public class Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a string:");
		        String strInput = scanner.nextLine();

		        System.out.println("Enter a number:");
		        int numInput = scanner.nextInt();

		        A objA = new A();
		        B objB = new B();

		        objA.display(strInput);
		        objB.display(numInput);

		        scanner.close();
		    
	}

}
