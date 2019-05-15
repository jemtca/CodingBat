
public class array2 {

	// given an array of ints, return true if every 2 that appears in the array is next to another 2
	public boolean twoTwo(int[] nums) {

		boolean b = true;

		for (int i = 0; i < nums.length; i++) {
			if (nums.length == 1 && nums[i] == 2) {
			  b = false;
			}
			else if (i == 0 && nums[i] == 2 && nums[i+1] != 2) {
				b = false;
			}
			else if (i == nums.length-1 && nums[nums.length-1] == 2 && nums[nums.length-2] != 2) {
				b = false;
			}
			else if (i < nums.length-1 && (nums[i] == 2 && nums[i+1] != 2) && (nums[i] == 2 && nums[i-1] != 2)) {
				b = false;
			}
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {4, 2, 2, 3};
		int[] y = {2, 2, 4};
		int[] z = {2, 2, 4, 2};

		System.out.println(o.twoTwo(x));
		System.out.println(o.twoTwo(y));
		System.out.println(o.twoTwo(z));

	}

}
