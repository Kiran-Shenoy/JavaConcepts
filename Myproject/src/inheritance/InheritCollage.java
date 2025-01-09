package inheritance;

//Base class (Parent class)
class Person {
 String name;
 int age;

 Person(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void displayInfo() {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Derived class (Child class) for Student
class Student extends Person {
 String studentId;

 Student(String name, int age, String studentId) {
     super(name, age);
     this.studentId = studentId;
 }

 void displayStudentInfo() {
     displayInfo();
     System.out.println("Student ID: " + studentId);
 }
}

//Derived class (Child class) for Professor
class Professor extends Person {
 String department;

 Professor(String name, int age, String department) {
     super(name, age);
     this.department = department;
 }

 void displayProfessorInfo() {
     displayInfo();
     System.out.println("Department: " + department);
     
    }
}

public class InheritCollage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create an instance of the Student class
	     Student student = new Student("Alice", 20, "S12345");
	     
	     // Create an instance of the Professor class
	     Professor professor = new Professor("Dr. Smith", 45, "Computer Science");

	     // Display information for the student
	     System.out.println("Student Information:");
	     student.displayStudentInfo();

	     // Display information for the professor
	     System.out.println("\nProfessor Information:");
	     professor.displayProfessorInfo();

	}

}
