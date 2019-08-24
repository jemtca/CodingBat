
public class ap1 {
	
	// start with two arrays of strings, a and b, each in alphabetical order, possibly with duplicates
	// return the count of the number of strings which appear in both arrays
	public int commonTwo(String[] a, String[] b) {
		
		int count = 0;
		boolean found = false;

		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				for (int j = 0; j < b.length && !found; j++) {
					if (a[i].equals(b[j])) {
						count++;
						found = true;
					}
				}
			}
			else {
				if (!a[i].equals(a[i-1])) {
					for (int j = 0; j < b.length && !found; j++) {
						if (a[i].equals(b[j])) {
							count++;
							found = true;
						}
					}
				}
			}
			found = false;
		}
		
		return count;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		String[] x1 = {"a", "c", "x"};
		String[] x2 = {"b", "c", "d", "x"};
		String[] y2 = {"a", "c", "x"};
		String[] y1 = {"a", "b", "c", "x", "z"};
		String[] z1 = {"a", "c", "x"};
		String[] z2 = {"a", "c", "x"};
		
		System.out.println(o.commonTwo(x1, x2));
		System.out.println(o.commonTwo(y1, y2));
		System.out.println(o.commonTwo(z1, z2));

	}

}
