package encapsulation;

//PoliceStation class demonstrating encapsulation
class PoliceStation {
 private String stationName;
 private String location;
 private int numberOfOfficers;

 // Constructor
 public PoliceStation(String stationName, String location, int numberOfOfficers) {
     this.stationName = stationName;
     this.location = location;
     this.numberOfOfficers = numberOfOfficers;
 }

 // Getter methods
 public String getStationName() {
     return stationName;
 }

 public String getLocation() {
     return location;
 }

 public int getNumberOfOfficers() {
     return numberOfOfficers;
 }

 // Method to add more officers
 public void addOfficers(int count) {
     if (count > 0) {
         numberOfOfficers += count;
         System.out.println(count + " officers added.");
     } else {
         System.out.println("Invalid number of officers.");
     }
 }

 // Display Police Station details
 public void displayDetails() {
     System.out.println("Police Station: " + stationName);
     System.out.println("Location: " + location);
     System.out.println("Number of Officers: " + numberOfOfficers);
 
    }
}

public class PoliceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Creating an instance of PoliceStation
	     PoliceStation station = new PoliceStation("Central Police Station", "New York", 50);

	     // Displaying initial details
	     station.displayDetails();

	     // Adding more officers
	     station.addOfficers(10);

	     // Displaying updated details
	     station.displayDetails();

	}

}
