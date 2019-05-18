
public class array2 {

	// given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array
	// the original array will contain at least one 4
	public int[] pre4(int[] nums) {

		boolean found = false;
		int index = 0;
		
		for (int i = 0; i < nums.length && !found; i++) {
			if (nums[i] == 4) {
				index = i;
				found = true;
			}
		}
		
		int[] x = new int[index];
		
		for (int i = 0; i < x.length; i++) {
			x[i] = nums[i];
		}

		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 4, 1};
		int[] y = {3, 1, 4};
		int[] z = {1, 4, 4};
		
		int[] temp;

		temp = o.pre4(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.pre4(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.pre4(z);
		System.out.println("[" + temp[0] + "]");

	}

}
