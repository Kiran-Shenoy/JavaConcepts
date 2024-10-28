package polymorphism;


//Parent class: Shape
class Shape {
 // Method to be overridden in subclasses
 public void draw() {
     System.out.println("Drawing a shape");
 }
}

//Subclass: Circle
class Circle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a circle");
 }
}

//Subclass: Rectangle
class Rectangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a rectangle");
 }
}

//Subclass: Triangle
class Triangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a triangle");
 }
}


     // Creating objects of different shapes
   
public class DemoPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Shape shape1 = new Circle();
		     Shape shape2 = new Rectangle();
		     Shape shape3 = new Triangle();

		     // Calling the draw method (runtime polymorphism)
		     shape1.draw();  // Output: Drawing a circle
		     shape2.draw();  // Output: Drawing a rectangle
		     shape3.draw();  // Output: Drawing a triangle
		 
	}

}
