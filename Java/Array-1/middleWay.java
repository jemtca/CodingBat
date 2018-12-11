
public class array1 {
	
	// given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements
	public int[] middleWay(int[] a, int[] b) {
		
		int x[] = new int[2];
		
		if (a.length == 3 && b.length == 3) {
			x[0] = a[1];
			x[1] = b[1];
		}
		
		return x;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x1 = {1, 2, 3};
		int[] x2 = {4, 5, 6};
		int[] y1 = {7, 7, 7};
		int[] y2 = {3, 8, 0};
		int[] z1 = {5, 2, 0};
		int[] z2 = {1, 2, 3};
		int[] temp;
		
		temp = o.middleWay(x1, x2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.middleWay(y1, y2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.middleWay(z1, z2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
	}

}
