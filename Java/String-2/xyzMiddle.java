
public class string2 {
	
	// given a string, does "xyz" appear in the middle of the string?
	// to define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one
	// this problem is harder than it looks
	public boolean xyzMiddle(String str) {
		
		boolean b = false;
		int middle = 0;
		
		if (str.length() > 2) {
			if (str.length() % 2 != 0) {
				middle = str.length() / 2;
				if (str.charAt(middle) == 'y' && str.charAt(middle-1) == 'x' && str.charAt(middle+1) == 'z') {
					b = true;
				}
			}
			else {
				middle = (str.length() / 2) - 1;
				if ((str.charAt(middle) == 'y' && str.charAt(middle-1) == 'x' && str.charAt(middle+1) == 'z') ||
					(str.charAt(middle+1) == 'y' && str.charAt(middle) == 'x' && str.charAt(middle+2) == 'z')) {
					b = true;
				}
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {

		string2 o = new string2();
		
		System.out.println(o.xyzMiddle("AAxyzBB"));
		System.out.println(o.xyzMiddle("AxyzBB"));
		System.out.println(o.xyzMiddle("AxyzBBB"));

	}

}
