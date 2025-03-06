package encapsulation;
import java.util.Scanner;
public class Emplo {
	
	    // Private attributes
	    private int empid;
	    private String empName;
	    private String designation;
	    private String email;
	    private long phone;
	    private double salary;

	    // Constructor to initialize employee details
	    public Emplo(int empid, String empName, String designation, String email, long phone, double salary) {
	        this.empid = empid;
	        this.empName = empName;
	        this.designation = designation;
	        this.email = email;
	        this.phone = phone;
	        this.salary = salary;
	    }

	    // Getter methods to access private attributes
	    public int getEmpid() {
	        return empid;
	    }

	    public String getEmpName() {
	        return empName;
	    }

	    public String getDesignation() {
	        return designation;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public long getPhone() {
	        return phone;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    // Setter methods to modify private attributes
	    public void setEmpid(int empid) {
	        this.empid = empid;
	    }

	    public void setEmpName(String empName) {
	        this.empName = empName;
	    }

	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public void setPhone(long phone) {
	        this.phone = phone;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println(empid);
	        System.out.println(empName);
	        System.out.println(designation);
	        System.out.println(email);
	        System.out.println(phone);
	        System.out.println(salary);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter employee details:");

	        System.out.print("Employee ID: ");
	        int empid = scanner.nextInt();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Employee Name: ");
	        String empName = scanner.nextLine();

	        System.out.print("Designation: ");
	        String designation = scanner.nextLine();

	        System.out.print("Email: ");
	        String email = scanner.nextLine();

	        System.out.print("Phone: ");
	        long phone = scanner.nextLong();
	        scanner.nextLine(); // Consume newline

	        System.out.print("Salary: ");
	        double salary = scanner.nextDouble();
	        scanner.nextLine(); // Consume newline

	        Emplo emp = new Emplo(empid, empName, designation, email, phone, salary);

	        System.out.println("\nEmployee Details:");
	        emp.displayEmployeeDetails();

	        scanner.close();
	    }
	}

