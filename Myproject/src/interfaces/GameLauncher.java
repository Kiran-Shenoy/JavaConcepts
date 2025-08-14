package interfaces;
import java.util.Scanner;

// Interface definition
interface Game {
    void start();
    void play();
    void end();
}

// Carrom class implementing Game interface
class Carrom implements Game {
    public void start() {
        System.out.println("🎯 Carrom game is starting!");
    }

    public void play() {
        System.out.println("🕹️ Playing Carrom... Aim for the queen!");
    }

    public void end() {
        System.out.println("🏁 Carrom game has ended. Hope you had fun!");
    }
}

public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// Main class to run the program
		        Scanner scanner = new Scanner(System.in);
		        Game game = new Carrom();

		        System.out.println("Welcome to the Game Launcher!");
		        System.out.println("Type 'start', 'play', or 'end' to control the Carrom game.");
		        System.out.println("Type 'exit' to quit.");

		        while (true) {
		            System.out.print("\nEnter your command: ");
		            String input = scanner.nextLine().trim().toLowerCase();

		            switch (input) {
		                case "start":
		                    game.start();
		                    break;
		                case "play":
		                    game.play();
		                    break;
		                case "end":
		                    game.end();
		                    break;
		                case "exit":
		                    System.out.println("👋 Exiting the game. Goodbye!");
		                    scanner.close();
		                    return;
		                default:
		                    System.out.println("❌ Invalid command. Try 'start', 'play', 'end', or 'exit'.");
		            }
		        }
		    
	}

}
