
public class string3 {

	// we'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right
	// return true if all the g's in the given string are happy
	public boolean gHappy(String str) {
		
		boolean b = true;
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
				if (i > 0 && str.charAt(i-1) == 'g') {
					b = true;
				}
				else if (i < str.length()-1 && str.charAt(i+1) == 'g') {
					b = true;
				}
				else {
					b = false;
				}
			}
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.gHappy("xxggxx"));
		System.out.println(o.gHappy("xxgxx"));
		System.out.println(o.gHappy("xxggyygxx"));

	}

}
