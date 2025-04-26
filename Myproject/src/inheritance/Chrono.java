package inheritance;
//TODO Auto-generated method stub
		import java.time.LocalDateTime;
		import java.time.format.DateTimeFormatter;
		import java.util.Random;
		
		class ChronoFlux {
		    private LocalDateTime dateTime;

		    public ChronoFlux() {
		        this.dateTime = LocalDateTime.now();
		    }

		    // Method to display current date and time
		    public void showCurrentTime() {
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		        System.out.println("Current Time: " + dateTime.format(formatter));
		    }

		    // Method to jump forward or backward in time randomly
		    public void fluxTime() {
		        Random random = new Random();
		        int fluxAmount = random.nextInt(100) - 50; // Random flux between -50 to +50 days
		        dateTime = dateTime.plusDays(fluxAmount);
		        System.out.println("Fluxed Time by " + fluxAmount + " days!");
		        showCurrentTime();
		    }

		    // Method to reset to the original time
		    public void resetTime() {
		        dateTime = LocalDateTime.now();
		        System.out.println("Time reset to the present.");
		        showCurrentTime();
		    }
		}

public class Chrono {

	public static void main(String[] args) {
		

		
	
		        ChronoFlux chrono = new ChronoFlux();

		        chrono.showCurrentTime();
		        chrono.fluxTime();  // Jump randomly in time
		        chrono.resetTime(); // Reset back to present
		   

	}

}
