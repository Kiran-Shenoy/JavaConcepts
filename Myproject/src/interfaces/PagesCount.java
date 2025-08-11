package interfaces;
import java.util.Scanner;

// Interface
interface Page {
    void displayContent();
}

// HomePage class
class HomePage implements Page {
    public void displayContent() {
        System.out.println("Welcome to the Home Page!");
    }
}

// AboutPage class
class AboutPage implements Page {
    public void displayContent() {
        System.out.println("This is the About Page. Learn more about us here.");
    }
}

// ContactPage class
class ContactPage implements Page {
    public void displayContent() {
        System.out.println("This is the Contact Page. Reach out to us!");
    }
}

// Main class
public class PagesCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter page name (home, about, contact): ");
		        String input = scanner.nextLine().toLowerCase();

		        Page page;

		        switch (input) {
		            case "home":
		                page = new HomePage();
		                break;
		            case "about":
		                page = new AboutPage();
		                break;
		            case "contact":
		                page = new ContactPage();
		                break;
		            default:
		                System.out.println("Invalid page name.");
		                return;
		        }

		        page.displayContent();
		        scanner.close();
		 

	}

}
