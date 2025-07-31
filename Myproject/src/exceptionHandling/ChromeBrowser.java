package exceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;

// Chrome-themed class
class ChromeTab {
    private String url;

    public void openTab(String url) {
        if (url == null || url.isEmpty()) {
            throw new IllegalArgumentException("URL cannot be empty!");
        }
        this.url = url;
        System.out.println("Opening Chrome tab with URL: " + url);
    }
}


public class ChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			      Scanner scanner = new Scanner(System.in);
		        ChromeTab tab = new ChromeTab();

		        try {
		            System.out.print("Enter a URL to open in Chrome: ");
		            String userInput = scanner.nextLine();

		            tab.openTab(userInput); // May throw IllegalArgumentException

		            System.out.print("Enter number of tabs to open: ");
		            int tabCount = scanner.nextInt(); // May throw InputMismatchException

		            System.out.println("You want to open " + tabCount + " tabs.");
		        } catch (InputMismatchException ime) {
		            System.err.println("❌ Invalid number format. Please enter an integer.");
		        } catch (IllegalArgumentException iae) {
		            System.err.println("❌ " + iae.getMessage());
		        } catch (Exception e) {
		            System.err.println("❌ Unexpected error: " + e.getMessage());
		        } finally {
		            System.out.println("✅ Program finished.");
		            scanner.close();
		        
		}

	}

}
