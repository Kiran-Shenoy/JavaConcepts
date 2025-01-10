package staticConcept;

public class StaticVa {

	    static int count = 0;  // static variable

	    StaticVa() {
	        count++;
	        System.out.println("Count is: " + count);
	    }

	    public static void main(String[] args) {
	    	StaticVa c1 = new StaticVa();  // Count is: 1
	    	StaticVa c2 = new StaticVa();  // Count is: 2
	    	StaticVa c3 = new StaticVa();  // Count is: 3
	    }
	}

	


