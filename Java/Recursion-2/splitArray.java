
public class recursion2 {
	
	// given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same
	// every int must be in one group or the other
	// write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitArray()
	public boolean splitArray(int[] nums) {
		
		return splitArrayHelper(0, nums, 0, 0);
		
	}
	
	public boolean splitArrayHelper(int start, int[] nums, int group1, int group2) {
		
		if (start >= nums.length) {
			return group1 == group2;
		}
		else {
			return splitArrayHelper(start + 1, nums, group1 + nums[start], group2) || splitArrayHelper(start + 1, nums, group1, group2 + nums[start]);
		}
		
	}
	
	public static void main(String[] args) {
		
		recursion2 o = new recursion2();
		
		int[] nums1 = {2, 2};
		int[] nums2 = {2, 3};
		int[] nums3 = {5, 2, 3};
		
		System.out.println(o.splitArray(nums1));
		System.out.println(o.splitArray(nums2));
		System.out.println(o.splitArray(nums3));

	}

}
