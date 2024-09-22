package aggregateComposite;
import java.util.List;
import java.util.ArrayList;




class Book5 {
    String title;

    public Book5(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private String name;
    private List<Book5> books;

    public Library(String name) {
        this.name = name;
        books = new ArrayList<>();
    }

    public void addBook(Book5 book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Books in " + name + " library:");
        for (Book5 b : books) {
            System.out.println(b.getTitle());
        }
    }
}

        


public class Aggregate {

	public static void main(String[] args) {
	
		Book5 book1 = new Book5("Java Programming");
        Book5 book2 = new Book5("Python Programming");

        Library library = new Library("City Library");
        library.addBook(book1);
        library.addBook(book2);

        library.displayBooks();
    }
}
