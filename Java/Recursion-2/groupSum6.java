
public class recursion2 {
	
	// given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target?
	// however, with the additional constraint that all 6's must be chosen
	public boolean groupSum6(int start, int[] nums, int target) {
		
		if (start >= nums.length) {
			return (target == 0);
		}
		
		// chosen
		if (groupSum6(start + 1, nums, target - nums[start])) {
			return true;
		}
		
		// not chosen
		if (nums[start] != 6 && groupSum6(start + 1, nums, target)) {
			return true;
		}
		
		return false;
		
	}
	
	public static void main(String[] args) {
		
		recursion2 o = new recursion2();
		
		int[] nums = {2, 4, 8};
		
		System.out.println(o.groupSum6(0, nums, 8));
		System.out.println(o.groupSum6(0, nums, 9));
		System.out.println(o.groupSum6(0, nums, 7));

	}

}
