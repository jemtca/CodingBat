
public class recursion2 {
	
	// given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints:
	// all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other
	public boolean split53(int[] nums) {
		
		return split53Helper(0, nums, 0, 0);
		
	}
	
	public boolean split53Helper(int start, int[] nums, int group1, int group2) {
		
		if (start >= nums.length) {
			return group1 == group2;
		}
		else {
			if (nums[start] % 5 == 0) {
				return split53Helper(start + 1, nums, group1 + nums[start], group2);
			}
			else if (nums[start] % 3 == 0 && nums[start] % 5 != 0) {
				return split53Helper(start + 1, nums, group1, group2 + nums[start]);
			}
			else {
				return split53Helper(start + 1, nums, group1 + nums[start], group2) || split53Helper(start + 1, nums, group1, group2 + nums[start]);
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		recursion2 o = new recursion2();
		
		int[] nums1 = {1, 1};
		int[] nums2 = {1, 1, 1};
		int[] nums3 = {2, 4, 2};
		
		System.out.println(o.split53(nums1));
		System.out.println(o.split53(nums2));
		System.out.println(o.split53(nums3));

	}

}
