package Singleton;
import java.util.Scanner;


class UniqueInstance {
    private static UniqueInstance instance;
    private String userInput;

    private UniqueInstance() {}

    public static UniqueInstance getInstance() {
        if (instance == null) {
            instance = new UniqueInstance();
        }
        return instance;
    }

    public void setInput(String data) {
        this.userInput = data;
    }

    public void displayInput() {
        System.out.println("User entered: " + userInput);
    }
}
public class SinExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Type something: ");
		        String input = scanner.nextLine();

		        UniqueInstance obj = UniqueInstance.getInstance();
		        obj.setInput(input);

		        obj.displayInput();

		        scanner.close();
		    
	}

}
