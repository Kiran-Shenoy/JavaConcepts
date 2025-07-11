package methodOverload;

public class Load {

    // Method with no parameters
    void display() {
        System.out.println("Display method with no parameters");
    }

    // Method with one int parameter
    void display(int a) {
        System.out.println("Display method with one int: " + a);
    }

    // Method with two parameters: int and String
    void display(int a, String b) {
        System.out.println("Display method with int and String: " + a + ", " + b);
    }

    // Method with one double parameter
    void display(double d) {
        System.out.println("Display method with one double: " + d);
    }


		    public static void main(String[] args) {
		    	Load obj = new Load();

		        obj.display();                  // Calls method with no parameters
		        obj.display(10);               // Calls method with one int
		        obj.display(20, "Hello");      // Calls method with int and String
		        obj.display(3.14);             // Calls method with one double
		    
	}

}
