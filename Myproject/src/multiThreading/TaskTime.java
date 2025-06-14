package multiThreading;
//TODO Auto-generated method stub
		import java.util.Scanner;

		// First thread class
		class Task1 extends Thread {
		    private String name;
		    
		    public Task1(String name) {
		        this.name = name;
		    }

		    @Override
		    public void run() {
		        System.out.println("Hello from Task1, " + name + "!");
		    }
		}

		// Second thread class
		class Task2 extends Thread {
		    private String name;

		    public Task2(String name) {
		        this.name = name;
		    }

		    @Override
		    public void run() {
		        System.out.println("Task2 welcomes you, " + name + "!");
		    }
		}

public class TaskTime {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter first name: ");
		        String name1 = scanner.nextLine();
		        
		        System.out.print("Enter second name: ");
		        String name2 = scanner.nextLine();

		        // Creating thread instances
		        Task1 t1 = new Task1(name1);
		        Task2 t2 = new Task2(name2);

		        // Starting threads
		        t1.start();
		        t2.start();

		        scanner.close();
		  

	}

}
