
public class ap1 {
	
	// given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array
	// the original array will contain at least "count" even numbers
	public int[] copyEvens(int[] nums, int count) {
		
		int[] x = new int[count];
		int index = 0;
		int c = 0;
		
		for (int i = 0; i < nums.length && c < count; i++) {
			if (nums[i] % 2 == 0) {
				x[index] = nums[i];
				c++;
				index++;
			}
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {3, 2, 4, 5, 8};
		int[] y = {3, 2, 4, 5, 8};
		int[] z = {6, 1, 2, 4, 5, 8};
		
		int[] temp;
		
		temp = o.copyEvens(x, 2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.copyEvens(y, 3);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.copyEvens(z, 3);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");

	}

}
