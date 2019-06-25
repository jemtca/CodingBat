
public class array3 {
	
	// given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer
	// the best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order
	public boolean linearIn(int[] outer, int[] inner) {
		
		boolean b = true;
		boolean found = false;
		
		for (int i = 0; i < inner.length && b; i++) {
			found = false;
			for (int j = 0; j < outer.length && !found; j++) {
				if (inner[i] == outer[j]) {
					found = true;
				}
			}
			if (!found) {
				b = false;
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] x1 = {1, 2, 4, 6};
		int[] x2 = {2, 4};
		int[] y1 = {1, 2, 4, 6};
		int[] y2 = {2, 3, 4};
		int[] z1 = {1, 2, 4, 4, 6};
		int[] z2 = {2, 4};
		
		System.out.println(o.linearIn(x1, x2));
		System.out.println(o.linearIn(y1, y2));
		System.out.println(o.linearIn(z1, z2));
		
	}

}
