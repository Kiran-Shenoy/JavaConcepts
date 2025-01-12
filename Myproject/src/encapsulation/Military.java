package encapsulation;

//Creating a class for Soldier
public class Soldiers {
 // Fields (data)
 private String name;
 private int rank;
 private String unit;

 // Constructor to initialize fields
 public Soldiers(String name, int rank, String unit) {
     this.name = name;
     this.rank = rank;
     this.unit = unit;
 }

 // Method to display soldier details
 public void displaySoldierDetails() {
     System.out.println("Name: " + name);
     System.out.println("Rank: " + rank);
     System.out.println("Unit: " + unit);
 }

 // Getter for name
 public String getName() {
     return name;
 }

 // Setter for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter for rank
 public int getRank() {
     return rank;
 }

 // Setter for rank
 public void setRank(int rank) {
     this.rank = rank;
 }

 // Getter for unit
 public String getUnit() {
     return unit;
 }

 // Setter for unit
 public void setUnit(String unit) {
     this.unit = unit;
 }
}

public class Military {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Soldiers soldier = new Soldiers("John Doe", 5, "Infantry");

	     // Displaying the soldier's details
	     soldier.displaySoldierDetails();

	     // Modifying the soldier's details using setters
	     soldier.setName("Jane Doe");
	     soldier.setRank(6);
	     soldier.setUnit("Artillery");

	     // Displaying the updated details
	     soldier.displaySoldierDetails();

	}

}
