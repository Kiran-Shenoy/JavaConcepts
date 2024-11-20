package polymorphism;
//Base class: Shape
class Shape {
 public void draw() {
     System.out.println("Drawing a shape...");
 }
}

//Derived class: Circle
class Circle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a circle...");
 }
}

//Derived class: Rectangle
class Rectangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a rectangle...");
 }
}

//Derived class: Triangle
class Triangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a triangle...");
 }
}


   

public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Shape myShape;

		     // Polymorphic behavior
		     myShape = new Circle();
		     myShape.draw();  // Output: Drawing a circle...

		     myShape = new Rectangle();
		     myShape.draw();  // Out
	}

}
