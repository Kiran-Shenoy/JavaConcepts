package methodOverload;

public class MethodOver {
	  // Overloaded method with one parameter
    void show(int num) {
        System.out.println("Number: " + num);
    }

    // Overloaded method with two parameters
    void show(int num, String text) {
        System.out.println("Number: " + num + ", Text: " + text);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MethodOver obj = new MethodOver();
		        obj.show(10); // Calls the first method
		        obj.show(10, "Hello"); // Calls the second method
		   
	}

}
