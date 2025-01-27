package collections;
//Define the Footwear interface
interface Footwear {
 void wear();
 void remove();
}

//Implement the Footwear interface in the Slipper class
class Slipper implements Footwear {
 private String brand;
 private String size;

 public Slipper(String brand, String size) {
     this.brand = brand;
     this.size = size;
 }

 @Override
 public void wear() {
     System.out.println("Wearing " + brand + " slippers of size " + size + ".");
 }

 @Override
 public void remove() {
     System.out.println("Removing " + brand + " slippers of size " + size + ".");
 }

 public void relax() {
     System.out.println("Relaxing in comfortable " + brand + " slippers.");
  }
}

public class Slip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     Footwear mySlippers = new Slipper("ComfortFlex", "10");

	     // Call the methods
	     mySlippers.wear();
	     ((Slipper) mySlippers).relax();
	     mySlippers.remove();

	}

}
