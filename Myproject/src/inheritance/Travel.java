package inheritance;
import java.util.Scanner;

// Base class
class Location {
    String country;
    String continent;

    void inputLocationDetails(Scanner sc) {
        System.out.print("Enter country: ");
        country = sc.nextLine();
        System.out.print("Enter continent: ");
        continent = sc.nextLine();
    }

    void showLocationDetails() {
        System.out.println("Country: " + country);
        System.out.println("Continent: " + continent);
    }
}

// Subclass
class City extends Location {
    String cityName;
    int population;

    void inputCityDetails(Scanner sc) {
        System.out.print("Enter city name: ");
        cityName = sc.nextLine();
        System.out.print("Enter population: ");
        population = sc.nextInt();
    }

    void showCityDetails() {
        showLocationDetails(); // Inherited method
        System.out.println("City: " + cityName);
        System.out.println("Population: " + population);
    }
}
public class Travel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        Scanner sc = new Scanner(System.in);
		        City myCity = new City();
		        myCity.inputLocationDetails(sc);
		        myCity.inputCityDetails(sc);
		        System.out.println("\n--- City Profile ---");
		        myCity.showCityDetails();
		        sc.close();
		    

	}

}
