package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

      
public class CollectionExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a HashMap to store grades and associated students
        HashMap<String, ArrayList<String>> gradeMap = new HashMap<>();

        // Adding students to grades
        addStudent(gradeMap, "A", "John");
        addStudent(gradeMap, "B", "Alice");
        addStudent(gradeMap, "A", "Mike");
        addStudent(gradeMap, "C", "Sophia");
        addStudent(gradeMap, "B", "David");

        // Displaying the students grouped by grades
        System.out.println("Students grouped by grades:");
        for (Map.Entry<String, ArrayList<String>> entry : gradeMap.entrySet()) {
            System.out.println("Grade " + entry.getKey() + ": " + entry.getValue());
        }
    }

    // Helper method to add a student to a grade
    private static void addStudent(HashMap<String, ArrayList<String>> map, String grade, String student) {
        map.putIfAbsent(grade, new ArrayList<>());
        map.get(grade).add(student);
    }
}
