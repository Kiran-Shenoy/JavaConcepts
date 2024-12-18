package polymorphism;


//Base class
class Shape {
 void draw() {
     System.out.println("Drawing a generic shape");
 }
}

//Derived class 1
class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

//Derived class 2
class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Derived class 3
class Triangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Triangle");
  }
}

public class PolyExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     // Base class reference pointing to different derived class objects
	     Shape shape;

	     shape = new Circle();
	     shape.draw(); // Output: Drawing a Circle

	     shape = new Rectangle();
	     shape.draw(); // Output: Drawing a Rectangle

	     shape = new Triangle();
	     shape.draw(); // Output: Drawing a Triangle

	}

}
