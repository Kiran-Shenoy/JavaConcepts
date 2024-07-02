package strings;
import java.util.Scanner;

public class Launch {

	public static void main(String[] args) {
		String s1="JAVA";
		String s2=new String("JAVA");
		
		if(s1==s2)
		{
			System.out.println("Refences are equal");
		}
		else
		{
			System.out.println("References are not equal");
		}
		

	}

}
