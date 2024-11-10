package polymorphism;


//Base class
class Employee {
 public void work() {
     System.out.println("Employee is working");
 }
}

//Derived class 1
class Manager extends Employee {
 @Override
 public void work() {
     System.out.println("Manager is planning and supervising");
 }
}

//Derived class 2
class Developer extends Employee {
 @Override
 public void work() {
     System.out.println("Developer is writing code");
 }
}

//Derived class 3
class Designer extends Employee {
 @Override
 public void work() {
     System.out.println("Designer is creating designs");
 
 
 }
}

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Array of Employee references
	     Employee[] employees = new Employee[3];
	     employees[0] = new Manager();
	     employees[1] = new Developer();
	     employees[2] = new Designer();

	     // Demonstrate polymorphism
	     for (Employee emp : employees) {
	         emp.work();  // Calls the overridden method based on the actual object type
	     }
	}

}
