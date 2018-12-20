
public class array1 {
	
	// start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element
	public int start1(int[] a, int[] b) {
		
		int count = 0;
		
		if (a.length > 0 && a[0] == 1)
			count++;
		if (b.length > 0 && b[0] == 1)
			count++;
		
		return count;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {7, 2, 3};
		int[] z = {1, 2};
		int[] x2 = {1, 3};
		int[] y2 = {1};
		int[] z2 = {};
		
		System.out.println(o.start1(x, x2));
		System.out.println(o.start1(y, y2));
		System.out.println(o.start1(z, z2));
		
	}

}
