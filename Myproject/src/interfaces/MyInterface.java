package interfaces;

//Define the interface
interface Animal {
 void sound();  // abstract method
 void habitat();  // abstract method
}

//Implementing the interface in a class
class Dog implements Animal {
 // Provide implementation for sound() method
 public void sound() {
     System.out.println("Dog barks");
 }

 // Provide implementation for habitat() method
 public void habitat() {
     System.out.println("Dogs live in houses or shelters");
 }
}

//Another class implementing the same interface
class Cat implements Animal {
 // Provide implementation for sound() method
 public void sound() {
     System.out.println("Cat meows");
 }

 // Provide implementation for habitat() method
 public void habitat() {
     System.out.println("Cats live in houses or streets");
 }
}


     // Create instances of Dog and Cat
   
 

public class MyInterface {

	public static void main(String[] args) {
		  Animal dog = new Dog();
		     Animal cat = new Cat();
		     
		     // Call methods
		     dog.sound();
		     dog.habitat();
		     
		     cat.sound();
		     cat.habitat();

	}

}
