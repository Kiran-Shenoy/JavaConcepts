package encapsulation;
import java.util.Scanner;
import java.util.ArrayList;
public class SelfDividing {
	public ArrayList<Integer> selfDividingNumbers(int left, int right) 
	{
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = left; i <= right; i++) 
		{
			if (isSelfDividing(i)) 
			{
				result.add(i);
				}
			}
		return result;
		} 
	private boolean isSelfDividing(int num) 
	{ 
		int temp = num; while (temp > 0)
		{ 
			int digit = temp % 10; 
			if (digit == 0 || num % digit != 0)
			{ 
				return false;
				}
			temp /= 10; 
			} 
		return true; 
		} 
	public static void main(String[] args) 
	{ 
		Scanner scan = new Scanner(System.in); 
		SelfDividing s = new SelfDividing(); 
		int left = scan.nextInt(); 
		int right = scan.nextInt(); 
		ArrayList<Integer> list = s.selfDividingNumbers(left, right); 
		System.out.println(list); 
	}

}
