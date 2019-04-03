
public class array2 {

	// given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other
	public boolean modThree(int[] nums) {
		
		boolean b = false;
		
		for (int i = 0; i < nums.length - 2; i++) {
			if ((nums[i] % 2 == 0 && nums[i+1] % 2 == 0 && nums[i+2] % 2 == 0) ||
				(nums[i] % 2 != 0 && nums[i+1] % 2 != 0 && nums[i+2] % 2 != 0)) {
				b = true;
			}
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {2, 1, 3, 5};
		int[] y = {2, 1, 2, 5};
		int[] z = {2, 4, 2, 5};
		
		System.out.println(o.modThree(x));
		System.out.println(o.modThree(y));
		System.out.println(o.modThree(z));

	}

}
