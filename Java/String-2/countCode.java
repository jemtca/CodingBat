
public class string2 {
	
	// return the number of times that the string "code" appears anywhere in the given string
	// except we'll accept any letter for the 'd', so "cope" and "cooe" count
	public int countCode(String str) {
		
		int x = 0;
		
		if (str.length() > 3) {
			for (int i = 0; i < str.length() - 3; i++) {
				if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
					x++;
				}
			}
		}
		
		return x;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.countCode("aaacodebbb"));
		System.out.println(o.countCode("codexxcode"));
		System.out.println(o.countCode("Hi-cozexxcope"));

	}

}
