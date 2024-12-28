package staticConcept;

class Organization {
    private String employeeName;
    private String department;

    // Static variable to track the organization name
    private static String organizationName = "Tech Innovators Inc.";

    // Constructor
    public Organization(String employeeName, String department) {
        this.employeeName = employeeName;
        this.department = department;
    }

    // Static method to set the organization name
    public static void setOrganizationName(String newOrganizationName) {
        organizationName = newOrganizationName;
    }

    // Static method to get the organization name
    public static String getOrganizationName() {
        return organizationName;
    }

    public void displayEmployeeDetails() {
        System.out.println("Organization: " + organizationName);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + department);
     }
}

public class StaticOrganise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        // Create employee objects
        Organization emp1 = new Organization("Alice", "Development");
        Organization emp2 = new Organization("Bob", "Marketing");

        // Display details for each employee
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Update organization name using static method
        Organization.setOrganizationName("Global Tech Solutions");
        System.out.println("\nUpdated Organization Name:");

        // Display updated details for employees
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
  
        
	}

}
