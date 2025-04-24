package encapsulation;
import java.util.Scanner;


class Student {
    private String studentName;
    private int studentID;

    // Setter methods
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(int studentID) {
        if (studentID > 0) {
            this.studentID = studentID;
        } else {
            System.out.println("Student ID must be positive.");
        }
    }

    // Getter methods
    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }
}

public class Encap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	
		        Scanner scanner = new Scanner(System.in);
		        Student student = new Student();

		        System.out.print("Enter student name: ");
		        String name = scanner.nextLine();
		        student.setStudentName(name);

		        System.out.print("Enter student ID: ");
		        int id = scanner.nextInt();
		        student.setStudentID(id);

		        System.out.println("\nStudent Details:");
		        System.out.println("Name: " + student.getStudentName());
		        System.out.println("ID: " + student.getStudentID());

		        scanner.close();
		    }
	
}
