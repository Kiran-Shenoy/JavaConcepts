package aggregateComposite;

class Engines {
    private String type;

    // Constructor
    public Engines(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Cars {
    private String brand;
    private Engines engine; // Car "has-a" Engine

    // Constructor
    public Cars(String brand, Engines engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Engine Type: " + engine.getType());
    
    }
}


public  class AggregateFunc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Engines engine = new Engines("V8");

        // Creating Car object and associating it with the Engine
        Cars car = new Cars("Ford Mustang", engine);

        // Display car details
        car.displayDetails();
	}

}
