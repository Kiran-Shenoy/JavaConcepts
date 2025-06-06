package aggregateComposite;

public class Compo {
	
	    
	    // Function f(x) = x * 2
	    public static int functionF(int x) {
	        return x * 2;
	    }

	    // Function g(x) = x + 3
	    public static int functionG(int x) {
	        return x + 3;
	    }

	    // Composite function h(x) = f(g(x))
	    public static int compositeFunction(int x) {
	        return functionF(functionG(x));
	    }

	    public static void main(String[] args) {
	        int x = 5;
	        System.out.println("Composite function result for x = " + x + " is " + compositeFunction(x));
	   
	}

}
