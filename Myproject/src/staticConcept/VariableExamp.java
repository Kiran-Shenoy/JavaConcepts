package staticConcept;



public class VariableExamp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create multiple objects
        Counterr obj1 = new Counterr();
        Counterr obj2 = new Counterr();
        Counterr obj3 = new Counterr();

        // Access the static variable through the static method
        System.out.println("Number of objects created: " + Counterr.getCount());
   
	}

}
class Counterr{
    // Static variable to count objects
    private static int count = 0;

    // Constructor increments count each time an object is created
    public Counterr() {
        count++;
    }

    // Static method to return the count
    public static int getCount() {
        return count;
    
    }
}
