
public class recursion2 {
	
	// given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with these additional constraints:
	// all multiples of 5 in the array must be included in the group
	// if the value immediately following a multiple of 5 is 1, it must not be chosen
	public boolean groupSum5(int start, int[] nums, int target) {
		
		if (start >= nums.length) {
			return target == 0;
		}
		else {
			// multiple of 5 must be chosen
			if (nums[start] % 5 == 0) {
				if (start <= nums.length - 2 && nums[start + 1] == 1) {
					// next one is a 1
					return groupSum5(start + 2, nums, target - nums[start]);
				} else {
					// next one is not a 1
					return groupSum5(start + 1, nums, target - nums[start]);
				}
			}
			else {
				// use item at start or not
				return groupSum5(start + 1, nums, target - nums[start]) || groupSum5(start + 1, nums, target);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		recursion2 o = new recursion2();
		
		int[] nums = {2, 5, 10, 4};
		
		System.out.println(o.groupSum5(0, nums, 19));
		System.out.println(o.groupSum5(0, nums, 17));
		System.out.println(o.groupSum5(0, nums, 12));

	}

}
