package multiThreading;


class Player extends Thread {
    private String playerName;
    private int score = 0;

    public Player(String name) {
        this.playerName = name;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int runs = (int) (Math.random() * 6) + 1; // Random runs between 1 and 6
            score += runs;
            System.out.println(playerName + " scored " + runs + " runs. Total: " + score);
            try {
                Thread.sleep(1000); // Simulating time taken for each run
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println(playerName + " finished with a total score of " + score);
       }
}

public class Match {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        player1.start();
        player2.start();

	}

}
