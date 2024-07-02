package strings;

import java.util.StringTokenizer;

public class LaunchToken {

	public static void main(String[] args) {
		String s="JAVA PYTHON SQL AI MACHINE LEARNING";
		StringTokenizer st=new StringTokenizer(s,"A");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}

	}

}
