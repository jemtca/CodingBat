
public class string2 {
	
	// return true if the given string contains a "bob" string, but where the middle 'o' char can be any char
	public boolean bobThere(String str) {
		
		boolean b = false;
		
		if (str.length() > 2) {
			for (int i = 0; i < str.length() - 2; i++) {
				if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
					b = true;
				}
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.bobThere("abcbob"));
		System.out.println(o.bobThere("b9b"));
		System.out.println(o.bobThere("bac"));

	}

}
