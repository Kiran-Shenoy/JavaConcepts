package strings;

public class LaunchGame {

	public static void main(String[] args) {
		StringBuffer st=new StringBuffer();
		System.out.println(st.capacity());
		st.append("JAVA");
		System.out.println(st);
		st.append(" JAVASCRIPT");
		System.out.println(st);
		st.append(" JAMES GOSLING");
		System.out.println(st);
		System.out.println(st.capacity());
		System.out.println(st.length());
		st.trimToSize();
		System.out.println(st.length());
		System.out.println(st.capacity());

	}

}
