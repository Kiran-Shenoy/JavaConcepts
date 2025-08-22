package methodOverload;
import java.util.Scanner;
public class Spotify {


    // Method 1: Play song by name
    void play(String songName) {
        System.out.println("Playing song: " + songName);
    }

    // Method 2: Play song by artist
    void play(String artistName, boolean isArtist) {
        System.out.println("Playing songs by artist: " + artistName);
    }

    // Method 3: Play song by duration
    void play(int duration) {
        System.out.println("Playing a song with duration: " + duration + " minutes");
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		        Scanner scanner = new Scanner(System.in);
		        Spotify spotify = new Spotify();

		        System.out.println("Welcome to Spotify 🎧");
		        System.out.println("Choose how you want to play a song:");
		        System.out.println("1. By Song Name");
		        System.out.println("2. By Artist Name");
		        System.out.println("3. By Duration");

		        int choice = scanner.nextInt();
		        scanner.nextLine(); // consume newline

		        switch (choice) {
		            case 1:
		                System.out.print("Enter song name: ");
		                String song = scanner.nextLine();
		                spotify.play(song);
		                break;
		            case 2:
		                System.out.print("Enter artist name: ");
		                String artist = scanner.nextLine();
		                spotify.play(artist, true);
		                break;
		            case 3:
		                System.out.print("Enter duration in minutes: ");
		                int duration = scanner.nextInt();
		                spotify.play(duration);
		                break;
		            default:
		                System.out.println("Invalid choice!");
		        }

		        scanner.close();
		

	}

}
