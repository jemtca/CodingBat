
public class array1 {
	
	// given 2 int arrays, a and b, of any length, return a new array with the first element of each array
	// if either array is length 0, ignore that array
	public int[] front11(int[] a, int[] b) {

		int[] newArray = {};

		if (a.length != 0 && b.length != 0 ) {
			newArray = new int[2];
			newArray[0] = a[0];
			newArray[1] = b[0];
		}
		else if (a.length != 0 && b.length == 0) {
			newArray = new int[1];
			newArray[0] = a[0];
		}
		else if (a.length == 0 && b.length != 0) {
			newArray = new int[1];
			newArray[0] = b[0];
		}
		
		return newArray;

	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {1};
		int[] z = {1, 7};
		int[] x2 = {7, 9, 8};
		int[] y2 = {2};
		int[] z2 = {};
		int[] temp;
		
		temp = o.front11(x, x2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.front11(y, y2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.front11(z, z2);
		System.out.println("[" + temp[0] + "]");
		
	}

}
