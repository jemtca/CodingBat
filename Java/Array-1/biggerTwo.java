
public class array1 {
	
	// start with 2 int arrays, a and b, each length 2
    // consider the sum of the values in each array
	// return the array which has the largest sum
	// in event of a tie, return a
	public int[] biggerTwo(int[] a, int[] b) {
		
		int[] newArray = new int[2];
		
		if (a.length == 2 && b.length == 2)
			if (a[0] + a[1] >= b[0] + b[1])
				newArray = a;
			else
				newArray = b;
		
		return newArray;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2};
		int[] y = {3, 4};
		int[] z = {1, 1};
		int[] x2 = {3, 4};
		int[] y2 = {1, 2};
		int[] z2 = {1, 2};
		int[] temp;
		
		temp = o.biggerTwo(x, x2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.biggerTwo(y, y2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.biggerTwo(z, z2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
	}

}
