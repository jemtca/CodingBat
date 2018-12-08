
public class array1 {
	
	// given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element
	// both arrays will be length 1 or more
	public boolean commonEnd(int[] a, int[] b) {
		
		boolean bool = false;
		
		if (a.length > 0 && b.length > 0)
			if (a[0] == b[0] || a[a.length-1] == b[b.length-1])
				bool = true;
		
		return bool;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] a1 = {1,2,3};
		int[] a2 = {7,3};
		int[] b1 = {1,2,3};
		int[] b2 = {7,3,2};
		int[] c1 = {1,2,3};
		int[] c2 = {1,3};
		
		System.out.println(o.commonEnd(a1,a2));
		System.out.println(o.commonEnd(b1,b2));
		System.out.println(o.commonEnd(c1,c2));
		
	}

}
