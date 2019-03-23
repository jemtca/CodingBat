
public class array2 {

	// given an array of ints, return true if the array contains no 1's and no 3's
	public boolean lucky13(int[] nums) {
		
		boolean b = true;
		boolean found = false;
		
		for (int i = 0; i < nums.length && !found; i++) {
			if (nums[i] == 1 || nums[i] == 3) {
				b = false;
				found = true;
			}
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {0, 2, 4};
		int[] y = {1, 2, 3};
		int[] z = {1, 2, 4};
		
		System.out.println(o.lucky13(x));
		System.out.println(o.lucky13(y));
		System.out.println(o.lucky13(z));

	}

}
