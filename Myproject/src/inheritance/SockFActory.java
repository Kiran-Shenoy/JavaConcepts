package inheritance;
import java.util.Scanner;

// Base class
class Sock {
    String color;
    int size;

    public Sock(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public void describe() {
        System.out.println("This is a sock of size " + size + " and color " + color + ".");
    }
}

// Subclass
class WoolSock extends Sock {
    public WoolSock(String color, int size) {
        super(color, size);
    }

    @Override
    public void describe() {
        System.out.println("This is a cozy wool sock of size " + size + " and color " + color + ".");
    }
}

// Another subclass
class CottonSock extends Sock {
    public CottonSock(String color, int size) {
        super(color, size);
    }

    @Override
    public void describe() {
        System.out.println("This is a soft cotton sock of size " + size + " and color " + color + ".");
    }
}

public class SockFActory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter sock type (wool/cotton): ");
		        String type = scanner.nextLine().toLowerCase();

		        System.out.print("Enter color: ");
		        String color = scanner.nextLine();

		        System.out.print("Enter size: ");
		        int size = scanner.nextInt();

		        Sock sock;
		        if (type.equals("wool")) {
		            sock = new WoolSock(color, size);
		        } else if (type.equals("cotton")) {
		            sock = new CottonSock(color, size);
		        } else {
		            sock = new Sock(color, size);
		        }

		        sock.describe();
		   
	}

}
