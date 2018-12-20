
public class array1 {
	
	// given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b
	// the arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays
	public int[] make2(int[] a, int[] b) {
		
		int[] newArray = new int[2];
		
		if (a.length + b.length > 1)
			if (a.length == 0) {
				newArray[0] = b[0];
				newArray[1] = b[1];
			}
			else if (a.length == 1) {
				newArray[0] = a[0];
				newArray[1] = b[0];
			}
			else {
				newArray[0] = a[0];
				newArray[1] = a[1];
			}
		
		return newArray;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {4, 5};
		int[] y = {4};
		int[] z = {};
		int[] x2 = {1, 2, 3};
		int[] y2 = {1, 2, 3};
		int[] z2 = {1, 2};
		int[] temp;
		
		temp = o.make2(x, x2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.make2(y, y2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.make2(z, z2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
	}

}
