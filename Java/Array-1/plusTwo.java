
public class array1 {
	
	// given 2 int arrays, each length 2, return a new array length 4 containing all their elements
	public int[] plusTwo(int[] a, int[] b) {
		
		int[] newArray = new int[4];
		
		if (a.length == 2 && b.length == 2) {
			newArray[0] = a[0];
			newArray[1] = a[1];
			newArray[2] = b[0];
			newArray[3] = b[1];
		}
		
		return newArray;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2};
		int[] y = {4, 4};
		int[] z = {9, 2};
		int[] x2 = {3, 4};
		int[] y2 = {2, 2};
		int[] z2 = {3, 4};
		int[] temp;
		
		temp = o.plusTwo(x, x2);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.plusTwo(y, y2);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.plusTwo(z, z2);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
	}

}
