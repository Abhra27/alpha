package p1;

public class SecureWeb {

	public static boolean SecWeb(String S)
	{
		boolean b=false;
		if(S.startsWith("https"))
		{
			b=true;
		}
		return b;
	}
	public static void main(String[] args) {
		String Y="https://en.wikipedia.org/wiki/Main_Page";
		System.out.println(SecWeb(Y));

	}

}
