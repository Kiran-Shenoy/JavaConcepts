package polymorphism;


class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("This is a generic animal sound");
    }
}

class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}



public class DodCat {

	public static void main(String[] args) {
		 Animal animal; // Reference of type Animal

	        animal = new Dog(); // Dog object assigned to Animal reference
	        animal.sound();      // Calls Dog's sound method

	        animal = new Cat(); // Cat object assigned to Animal reference
	        animal.sound();      // Calls Cat's sound method
	  

	}

}
