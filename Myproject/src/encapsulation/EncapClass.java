package encapsulation;


//Employee.java - Class with encapsulated fields
class Employee {
 private String employeeName;
 private int employeeID;
 private double salary;

 // Constructor to initialize fields
 public Employee(String employeeName, int employeeID, double salary) {
     this.employeeName = employeeName;
     this.employeeID = employeeID;
     this.salary = salary;
 }

 // Getter for employeeName
 public String getEmployeeName() {
     return employeeName;
 }

 // Setter for employeeName
 public void setEmployeeName(String employeeName) {
     this.employeeName = employeeName;
 }

 // Getter for employeeID
 public int getEmployeeID() {
     return employeeID;
 }

 // Setter for employeeID
 public void setEmployeeID(int employeeID) {
     this.employeeID = employeeID;
 }

 // Getter for salary
 public double getSalary() {
     return salary;
 }

 // Setter for salary
 public void setSalary(double salary) {
     if (salary > 0) {
         this.salary = salary;
     } else {
         System.out.println("Salary must be positive.");
     }
 
     
 }
}

public class EncapClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an Employee object
	     Employee emp = new Employee("John Doe", 101, 50000);

	     // Access fields using getter methods
	     System.out.println("Employee Name: " + emp.getEmployeeName());
	     System.out.println("Employee ID: " + emp.getEmployeeID());
	     System.out.println("Salary: " + emp.getSalary());

	     // Modify fields using setter methods
	     emp.setEmployeeName("Jane Smith");
	     emp.setSalary(60000);

	     System.out.println("\nUpdated Employee Details:");
	     System.out.println("Employee Name: " + emp.getEmployeeName());
	     System.out.println("Salary: " + emp.getSalary());
	}

}
