
public class ap1 {
	
	// start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates
	// return a new array containing the first N elements from the two arrays
	// the result array should be in alphabetical order and without duplicates
	// A and B will both have a length which is N or more
	public String[] sumHeights2(String[] a, String[] b, int n) {
		
		String[] s = new String[n];
		int index = 0;
		int one = 0;
		int two = 0;
		
		for (int i = 0; i < n; i++) {
			if (a[one].compareTo(b[two]) < 0) {
				s[index] = a[one];
				one++;
				index++;
			}
			else if (a[one].compareTo(b[two]) > 0) {
				s[index] = b[two];
				two++;
				index++;
			}
			else {
				s[index] = a[one];
				one++;
				two++;
				index++;
			}
		}
		
		return s;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] x1 = {"a", "c", "z"};
		String[] x2 = {"b", "f", "z"};
		String[] y1 = {"a", "c", "z"};
		String[] y2 = {"c", "f", "z"};
		String[] z1 = {"f", "g", "z"};
		String[] z2 = {"c", "f", "g"};
		
		String[] s;
		
		s = o.sumHeights2(x1, x2, 3);
		System.out.println("[" + s[0] + ", " + s[1] + ", " + s[2] + "]");
		
		s = o.sumHeights2(y1, y2, 3);
		System.out.println("[" + s[0] + ", " + s[1] + ", " + s[2] + "]");
		
		s = o.sumHeights2(z1, z2, 3);
		System.out.println("[" + s[0] + ", " + s[1] + ", " + s[2] + "]");

	}

}
