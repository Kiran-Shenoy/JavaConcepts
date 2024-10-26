package aggregateComposite;


//Part class: CPU (used inside Computer)
class CPU {
 private String brand;
 private double speed;

 // Constructor
 public CPU(String brand, double speed) {
     this.brand = brand;
     this.speed = speed;
 }

 // Getter methods
 public String getBrand() {
     return brand;
 }

 public double getSpeed() {
     return speed;
 }
}

//Whole class: Computer (contains a CPU object)
class Computer {
 private String model;
 private CPU cpu; // Composition relationship

 // Constructor
 public Computer(String model, CPU cpu) {
     this.model = model;
     this.cpu = cpu;
 }

 // Method to display computer details
 public void displayDetails() {
     System.out.println("Computer Model: " + model);
     System.out.println("CPU Brand: " + cpu.getBrand());
     System.out.println("CPU Speed: " + cpu.getSpeed() + " GHz");
 }
}
     // Creating a CPU object
  
public class CompositeFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   CPU cpu = new CPU("Intel", 3.5);

		     // Creating a Computer object with the CPU object
		     Computer comp = new Computer("Dell Inspiron", cpu);

		     // Displaying the details
		     comp.displayDetails();
		 
	}

}
