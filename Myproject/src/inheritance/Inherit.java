package inheritance;

//Base class
class Animals{
 String name;

 public void eat() {
     System.out.println(name + " is eating.");
 }
}

//Derived class
class Dog extends Animals {
 public void bark() {
     System.out.println(name + " is barking.");
 }
}


public class Inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   Dog myDog = new Dog();
		     
		     // Set name (inherited from Animal class)
		     myDog.name = "Buddy";
		     
		     // Call methods from both the base and derived class
		     myDog.eat();   // Inherited method
		     myDog.bark();
	}

}
