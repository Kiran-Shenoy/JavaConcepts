package interfaces;


//Define an interface
interface Library {
 void borrowBook(String bookName);
 void returnBook(String bookName);
}

//Class implementing the interface
class PublicLibrary implements Library {
 private int totalBooks;

 // Constructor
 public PublicLibrary(int totalBooks) {
     this.totalBooks = totalBooks;
 }

 // Implement borrowBook method
 @Override
 public void borrowBook(String bookName) {
     if (totalBooks > 0) {
         totalBooks--;
         System.out.println("Book borrowed: " + bookName);
         System.out.println("Books remaining: " + totalBooks);
     } else {
         System.out.println("No books available to borrow.");
     }
 }

 // Implement returnBook method
 @Override
 public void returnBook(String bookName) {
     totalBooks++;
     System.out.println("Book returned: " + bookName);
     System.out.println("Books available: " + totalBooks);
 
   }
}

public class DemoLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // Create a PublicLibrary object
	     PublicLibrary library = new PublicLibrary(5);

	     // Borrow a book
	     library.borrowBook("Harry Potter");
	     // Borrow another book
	     library.borrowBook("The Hobbit");

	     // Return a book
	     library.returnBook("Harry Potter");

	     // Borrow more books
	     library.borrowBook("Pride and Prejudice");
	     library.borrowBook("1984");
	     library.borrowBook("To Kill a Mockingbird");

	     // Attempt to borrow when no books are left
	     library.borrowBook("The Great Gatsby");
	 
	}

}
