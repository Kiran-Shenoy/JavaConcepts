package aggregateComposite;


import java.util.ArrayList;
import java.util.List;

// Component
interface Employee {
    void showEmployeeDetails();
}

// Leaf
class Developer implements Employee {
    private String name;
    
    public Developer(String name) {
        this.name = name;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(name);
    }
}

// Composite
class Team implements Employee {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employees) {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp) {
        employees.add(emp);
  }
}

public class EmployeeComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Developer dev1 = new Developer("John");
        Developer dev2 = new Developer("Alice");

        Team team = new Team();
        team.addEmployee(dev1);
        team.addEmployee(dev2);

        team.showEmployeeDetails(); // Output: John Alice
  
	}

}
