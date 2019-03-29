
public class array2 {

	// given an array of ints, return true if it contains no 1's or it contains no 4's
	public boolean no14(int[] nums) {
		
		boolean b = true;
		boolean one = false;
		boolean four = false;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				one = true;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				four = true;
			}
		}
		
		if (one && four) {
			b = false;
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 3};
		int[] y = {1, 2, 3, 4};
		int[] z = {2, 3, 4};
		
		System.out.println(o.no14(x));
		System.out.println(o.no14(y));
		System.out.println(o.no14(z));

	}

}
