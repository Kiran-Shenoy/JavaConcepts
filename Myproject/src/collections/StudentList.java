package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       
        List<String> studentNames = new ArrayList<>();

        // Adding students to the list
        studentNames.add("Alice");
        studentNames.add("Bob");
        studentNames.add("Charlie");
        studentNames.add("Diana");

        // Display the original list
        System.out.println("Original List: " + studentNames);

        // Sort the list alphabetically
        Collections.sort(studentNames);
        System.out.println("Sorted List: " + studentNames);

        // Reverse the list
        Collections.reverse(studentNames);
        System.out.println("Reversed List: " + studentNames);

        // Search for a specific name
        String searchName = "Charlie";
        if (studentNames.contains(searchName)) {
            System.out.println(searchName + " is in the list.");
        } else {
            System.out.println(searchName + " is not in the list.");
        }

        // Remove a student from the list
        studentNames.remove("Bob");
        System.out.println("After Removal: " + studentNames);
    }


}
