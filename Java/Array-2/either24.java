
public class array2 {

	// given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both
	public boolean either24(int[] nums) {

		boolean b = false;
		boolean two = false;
		boolean four = false;
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 2 && nums[i+1] == 2) {
				b = true;
				two = true;
			}
			else if (nums[i] == 4 && nums[i+1] == 4) {
				b = true;
				four = true;
			}
		}
		
		if (two && four) {
			b = false;
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 2};
		int[] y = {4, 4, 1};
		int[] z = {4, 4, 1, 2, 2};

		System.out.println(o.either24(x));
		System.out.println(o.either24(y));
		System.out.println(o.either24(z));

	}

}
