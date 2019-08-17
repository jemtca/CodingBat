
public class ap1 {
	
	// given 2 arrays that are the same length containing strings, compare the 1st string in one array to the 1st string in the other array, the 2nd to the 2nd and so on
	// count the number of times that the 2 strings are non-empty and start with the same char
	// the strings may be any length, including 0
	public int dividesSelf(String[] a, String[] b) {
		
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			if ((!a[i].isEmpty() && !b[i].isEmpty()) && (a[i].charAt(0) == b[i].charAt(0))) {
				count++;
			}
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] x1 = {"aa", "bb", "cc"};
		String[] x2 = {"aaa", "xx", "bb"};
		String[] y1 = {"aa", "bb", "cc"};
		String[] y2 = {"aaa", "b", "bb"};
		String[] z1 = {"aa", "bb", "cc"};
		String[] z2 = {"", "", "ccc"};
		
		System.out.println(o.dividesSelf(x1, x2));
		System.out.println(o.dividesSelf(y1, y2));
		System.out.println(o.dividesSelf(z1, z2));

	}

}
