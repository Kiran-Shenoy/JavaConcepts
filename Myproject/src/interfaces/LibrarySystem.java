package interfaces;


//Defining the interface
interface LibraryItem {
 void displayDetails();
}

//Book class implementing the LibraryItem interface
class Book implements LibraryItem {
 private String title;
 private String author;

 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 @Override
 public void displayDetails() {
     System.out.println("Book Title: " + title);
     System.out.println("Author: " + author);
 }
}

//Magazine class implementing the LibraryItem interface
class Magazine implements LibraryItem {
 private String name;
 private int issueNumber;

 public Magazine(String name, int issueNumber) {
     this.name = name;
     this.issueNumber = issueNumber;
 }

 @Override
 public void displayDetails() {
     System.out.println("Magazine Name: " + name);
     System.out.println("Issue Number: " + issueNumber);
 }
}



public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  LibraryItem book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
		     LibraryItem magazine = new Magazine("National Geographic", 202);

		     // Displaying details
		     book.displayDetails();
		     System.out.println();
		     magazine.displayDetails();
	}

}
