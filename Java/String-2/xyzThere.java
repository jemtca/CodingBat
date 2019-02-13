
public class string2 {
	
	// return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.)
	// so "xxyz" counts but "x.xyz" does not
	public boolean xyzThere(String str) {
		
		boolean b = false;

		for (int i = 0; i < str.length()-2; i++) {
			if (i == 0 && str.charAt(i) == 'x' && str.substring(i, i+3).equals("xyz")) {
			  b = true;
			}
			else if (i > 0 && str.charAt(i-1) != '.' && str.charAt(i) == 'x' && str.substring(i, i+3).equals("xyz")) {
				b = true;
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.xyzThere("abcxyz"));
		System.out.println(o.xyzThere("abc.xyz"));
		System.out.println(o.xyzThere("xyz.abc"));

	}

}
