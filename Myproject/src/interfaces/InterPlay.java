package interfaces;

//Define the first interface
interface Flyable {
 void fly();
}

//Define the second interface
interface Swimmable {
 void swim();
}

//Implement both interfaces in a class
class Duck implements Flyable, Swimmable {
 // Provide implementation for the fly method
 public void fly() {
     System.out.println("The duck flies in the sky.");
 }

 // Provide implementation for the swim method
 public void swim() {
     System.out.println("The duck swims in the water.");
 
    }
}

public class InterPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Duck myDuck = new Duck();
		     myDuck.fly();   // Calls the fly method
		     myDuck.swim();  // Calls the swim method

	}

}
