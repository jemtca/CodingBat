
public class recursion2 {
	
	// given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint:
	// if a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen
	public boolean groupNoAdj(int start, int[] nums, int target) {
		
		if (start >= nums.length) {
			return target == 0;
		} else {
			// use item at start + skip next item or not use item at start
			return groupNoAdj(start + 2, nums, target - nums[start]) || groupNoAdj(start + 1, nums, target);
		}
		
	}
	
	public static void main(String[] args) {
		
		recursion2 o = new recursion2();
		
		int[] nums = {2, 5, 10, 4};
		
		System.out.println(o.groupNoAdj(0, nums, 12));
		System.out.println(o.groupNoAdj(0, nums, 14));
		System.out.println(o.groupNoAdj(0, nums, 7));

	}

}
