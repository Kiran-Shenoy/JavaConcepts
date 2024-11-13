package aggregateComposite;

//Class representing an Address
class Address {
 String city;
 String state;
 String country;

 // Constructor
 public Address(String city, String state, String country) {
     this.city = city;
     this.state = state;
     this.country = country;
 }

 // Method to display the address
 public void displayAddress() {
     System.out.println(city + ", " + state + ", " + country);
 }
}

//Class representing a Student that aggregates an Address
class Students {
 String name;
 int id;
 Address address; // Aggregation

 // Constructor
 public Students(String name, int id, Address address) {
     this.name = name;
     this.id = id;
     this.address = address;
 }

 // Method to display student details
 public void displayStudent() {
     System.out.println("Student Name: " + name);
     System.out.println("Student ID: " + id);
     System.out.print("Address: ");
     address.displayAddress();

     }
}

public class AggregateAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create an Address object
	     Address addr = new Address("New York", "NY", "USA");

	     // Create a Student object with the Address object
	     Students student = new Students("John Doe", 123, addr);

	     // Display student details
	     student.displayStudent();

	}

}
