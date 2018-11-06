
public class warmup2 {

	// this function return a new string where all the strings "yak" are removed, but the 'a' can be any char
	public String stringYak(String str) {
	
		String s = "";

		for (int i = 0; i < str.length(); i++)
			if (i < str.length() - 2 && str.charAt(i) == 'y' && str.charAt(i+2) == 'k')
				i += 2;
			else
				s = s + str.charAt(i);
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();

		System.out.println(o.stringYak("yakpak"));
		System.out.println(o.stringYak("pakyak"));
		System.out.println(o.stringYak("yak123ya"));

	}

}
