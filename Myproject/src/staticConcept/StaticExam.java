package staticConcept;


//StaticExample.java - Demonstrates the use of static variables and methods

class StaticExamples {
 // Static variable
 static int staticCounter = 0;

 // Instance variable
 int instanceCounter = 0;

 // Constructor
 public StaticExamples() {
     staticCounter++;
     instanceCounter++;
 }

 // Static method
 public static void printStaticCounter() {
     System.out.println("Static Counter: " + staticCounter);
 }

 // Non-static method
 public void printInstanceCounter() {
     System.out.println("Instance Counter: " + instanceCounter);
 }
}


   
public class StaticExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create first object
	     StaticExamples obj1 = new StaticExamples();
	     obj1.printInstanceCounter();
	     StaticExamples.printStaticCounter();

	     // Create second object
	     StaticExamples obj2 = new StaticExamples();
	     obj2.printInstanceCounter();
	     StaticExamples.printStaticCounter();

	     // Accessing static variable without creating an instance
	     System.out.println("Accessing staticCounter directly: " + StaticExamples.staticCounter);
	 
	}

}
