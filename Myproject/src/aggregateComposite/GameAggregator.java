package aggregateComposite;
//TODO Auto-generated method stub
		import java.util.ArrayList;
		import java.util.Scanner;

		// Class to represent a Game
		class Game {
		    String name;
		    String genre;
		    int rating; // out of 10

		    // Constructor
		    public Game(String name, String genre, int rating) {
		        this.name = name;
		        this.genre = genre;
		        this.rating = rating;
		    }

		    // Method to display game details
		    public void display() {
		        System.out.println("Name: " + name);
		        System.out.println("Genre: " + genre);
		        System.out.println("Rating: " + rating + "/10");
		        System.out.println("----------------------");
		    }
		}
public class GameAggregator {

	public static void main(String[] args) {
		

		        Scanner scanner = new Scanner(System.in);
		        ArrayList<Game> games = new ArrayList<>();

		        System.out.print("How many games do you want to enter? ");
		        int count = scanner.nextInt();
		        scanner.nextLine(); // consume newline

		        for (int i = 0; i < count; i++) {
		            System.out.println("Enter details for Game #" + (i + 1));

		            System.out.print("Name: ");
		            String name = scanner.nextLine();

		            System.out.print("Genre: ");
		            String genre = scanner.nextLine();

		            System.out.print("Rating (out of 10): ");
		            int rating = scanner.nextInt();
		            scanner.nextLine(); // consume newline

		            Game game = new Game(name, genre, rating);
		            games.add(game);
		        }

		        System.out.println("\n🎮 Game Collection:");
		        for (Game g : games) {
		            g.display();
		        }

		        scanner.close();
	

	}

}
