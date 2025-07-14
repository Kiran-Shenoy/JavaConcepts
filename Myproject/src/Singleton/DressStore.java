package Singleton;
class DressStore2 {

    // Step 1: Private static variable of the same class that is the only instance
    private static DressStore2 instance;

    // Step 2: Private constructor to restrict instantiation
    private DressStore2() {
        System.out.println("DressStore instance created.");
    }

    // Step 3: Public static method that returns the instance
    public static DressStore getInstance() {
        if (instance == null) {
            instance = new DressStore2();
        }
        return instance;
    }

    // Example method in singleton
    public void displayAvailableDresses() {
        System.out.println("Available dresses: Gown, Saree, Tuxedo, Kurta, Lehenga");
    }
}

public class DressStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Singleton class
	
		
		        // Get the single instance of DressStore
		        DressStore2 store1 = DressStore2.getInstance();
		        store1.displayAvailableDresses();

		        // Try getting another instance
		        DressStore2 store2 = DressStore2.getInstance();

		        // Verify both references point to the same instance
		        if (store1 == store2) {
		            System.out.println("Both references point to the same DressStore instance.");
		        } else {
		            System.out.println("Different instances exist! Singleton failed.");
		        }
		 

	}

}
