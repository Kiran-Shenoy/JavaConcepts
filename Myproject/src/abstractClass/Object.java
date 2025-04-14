package abstractClass;
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void introduce() {
        System.out.println("Hi, my name is " + name + " and I am " + age + " years old.");
    }
}
public class Object {

	public static void main(String[] args) {
		        // Creating objects
		        Person person1 = new Person("Alice", 25);
		        Person person2 = new Person("Bob", 30);

		        // Calling methods on objects
		        person1.introduce();
		        person2.introduce();
		    

	}

}
