package collections;
import java.util.ArrayList;
import java.util.Scanner;

// Define Book class
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String toString() {
        return "📚 Book: " + title + " by " + author;
    }
}

// Define Movie class
class Movie {
    String name;
    String director;

    Movie(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public String toString() {
        return "🎬 Movie: " + name + " directed by " + director;
    }
}

public class BookStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Object> library = new ArrayList<>();

		        System.out.println("Enter items (book/movie). Type 'exit' to stop.");

		        while (true) {
		            System.out.print("Type (book/movie): ");
		            String type = scanner.nextLine();

		            if (type.equalsIgnoreCase("exit")) break;

		            if (type.equalsIgnoreCase("book")) {
		                System.out.print("Enter book title: ");
		                String title = scanner.nextLine();
		                System.out.print("Enter author name: ");
		                String author = scanner.nextLine();
		                library.add(new Book(title, author));
		            } else if (type.equalsIgnoreCase("movie")) {
		                System.out.print("Enter movie name: ");
		                String name = scanner.nextLine();
		                System.out.print("Enter director: ");
		                String director = scanner.nextLine();
		                library.add(new Movie(name, director));
		            } else {
		                System.out.println("Unknown type. Try again.");
		            }
		        }

		        System.out.println("\nYour Collection:");
		        for (Object item : library) {
		            System.out.println(item.toString());
		        }

		        scanner.close();
		    }
		

}
