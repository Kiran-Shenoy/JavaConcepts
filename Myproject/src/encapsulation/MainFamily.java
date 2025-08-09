package encapsulation;
import java.util.Scanner;

class Family {
    // Private fields (encapsulation)
    private String fatherName;
    private String motherName;
    private int numberOfChildren;

    // Public getters and setters
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }
}

public class MainFamily {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        Family family = new Family();

		        // Taking user input
		        System.out.print("Enter father's name: ");
		        family.setFatherName(scanner.nextLine());

		        System.out.print("Enter mother's name: ");
		        family.setMotherName(scanner.nextLine());

		        System.out.print("Enter number of children: ");
		        family.setNumberOfChildren(scanner.nextInt());

		        // Displaying the data
		        System.out.println("\n--- Family Details ---");
		        System.out.println("Father's Name: " + family.getFatherName());
		        System.out.println("Mother's Name: " + family.getMotherName());
		        System.out.println("Number of Children: " + family.getNumberOfChildren());
		   

	}

}
