package encapsulation;
import java.util.Scanner;

class Employee11 {
    private String employeeName;
    private int employeeAge;

    // Getter methods
    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeAge() {
        return employeeAge;
    }

    // Setter methods
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void setEmployeeAge(int age) {
        if (age > 0) {
            this.employeeAge = age;
        } else {
            System.out.println("Age must be a positive number!");
        }
    }
}

public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        Employee11 employee = new Employee11();

		        // Taking user input
		        System.out.print("Enter employee name: ");
		        employee.setEmployeeName(scanner.nextLine());

		        System.out.print("Enter employee age: ");
		        employee.setEmployeeAge(scanner.nextInt());

		        // Displaying the data using getter methods
		        System.out.println("Employee Name: " + employee.getEmployeeName());
		        System.out.println("Employee Age: " + employee.getEmployeeAge());

		        scanner.close();
		   

	}

}
