package multiThreading;
import java.util.Scanner;


class BohemianRhapsody extends Thread {
    private String songName;

    BohemianRhapsody(String songName) {
        this.songName = songName;
    }

    public void run() {
        System.out.println("🎸 Playing '" + songName + "' in BohemianRhapsody thread...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("BohemianRhapsody interrupted!");
        }
        System.out.println("🎵 '" + songName + "' finished in BohemianRhapsody.");
    }
}


class Imagine extends Thread {
    private String songName;

    Imagine(String songName) {
        this.songName = songName;
    }

    public void run() {
        System.out.println("🎹 Playing '" + songName + "' in Imagine thread...");
        try {
            Thread.sleep(1200);
        } catch (InterruptedException e) {
            System.out.println("Imagine interrupted!");
        }
        System.out.println("🎶 '" + songName + "' finished in Imagine.");
    }
}

class ShapeOfYou extends Thread {
    private String songName;

    ShapeOfYou(String songName) {
        this.songName = songName;
    }

    public void run() {
        System.out.println("🥁 Playing '" + songName + "' in ShapeOfYou thread...");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            System.out.println("ShapeOfYou interrupted!");
        }
        System.out.println("🎧 '" + songName + "' finished in ShapeOfYou.");
    }
}
public class SongDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your favorite song name: ");
		        String userSong = scanner.nextLine();

		        // Create threads with user input
		        BohemianRhapsody thread1 = new BohemianRhapsody(userSong);
		        Imagine thread2 = new Imagine(userSong);
		        ShapeOfYou thread3 = new ShapeOfYou(userSong);

		        // Start all threads
		        thread1.start();
		        thread2.start();
		        thread3.start();
		   

	}

}
