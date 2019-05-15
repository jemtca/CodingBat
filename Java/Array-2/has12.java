
public class array2 {

	// given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array
	public boolean has12(int[] nums) {

		boolean b = false;
		boolean success = false;

		for (int i = 0; i < nums.length && !success; i++) {
			if (nums[i] == 1) {
				for (int j = i + 1; j < nums.length && !success; j++) {
					if (nums[j] == 2) {
						b = true;
						success = true;
					}
				}
			}
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 3, 2};
		int[] y = {3, 1, 2};
		int[] z = {3, 1, 4, 5, 2};

		System.out.println(o.has12(x));
		System.out.println(o.has12(y));
		System.out.println(o.has12(z));

	}

}
