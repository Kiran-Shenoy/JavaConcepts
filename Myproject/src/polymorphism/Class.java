package polymorphism;
//Parent class
class Teacher {
 void teach() {
     System.out.println("Teaching students");
 }
}

//Child class 1
class MathTeacher extends Teacher {
 @Override
 void teach() {
     System.out.println("Teaching Mathematics");
 }
}

//Child class 2
class ScienceTeacher extends Teacher {
 @Override
 void teach() {
     System.out.println("Teaching Science");
 }
}

//Child class 3
class EnglishTeacher extends Teacher {
 @Override
 void teach() {
     System.out.println("Teaching English");
  }
}

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Teacher myMathTeacher = new MathTeacher();
	     Teacher myScienceTeacher = new ScienceTeacher();
	     Teacher myEnglishTeacher = new EnglishTeacher();

	     // Call the teach() method
	     myMathTeacher.teach(); // Outputs "Teaching Mathematics"
	     myScienceTeacher.teach(); // Outputs "Teaching Science"
	     myEnglishTeacher.teach(); // Outputs "Teaching English"

	}

}
