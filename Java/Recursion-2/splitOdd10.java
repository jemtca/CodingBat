
public class recursion2 {
	
	// given an array of ints, is it possible to divide the ints into two groups,
	// so that the sum of one group is a multiple of 10, and the sum of the other group is odd
	// every int must be in one group or the other
	// write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from splitOdd10()
	public boolean splitOdd10(int[] nums) {
		
		return splitOdd10Helper(0, nums, 0, 0);
		
	}
	
	public boolean splitOdd10Helper(int start, int[] nums, int group1, int group2) {
		
		if (start >= nums.length) {
			return ((group1 % 10 == 0 && group2 % 2 != 0) || (group2 % 10 == 0 && group1 % 2 != 0));
		}
		else {
			return splitOdd10Helper(start + 1, nums, group1 + nums[start], group2) || splitOdd10Helper(start + 1, nums, group1, group2 + nums[start]);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		recursion2 o = new recursion2();
		
		int[] nums1 = {5, 5, 5};
		int[] nums2 = {5, 5, 6};
		int[] nums3 = {5, 5, 6, 1};
		
		System.out.println(o.splitOdd10(nums1));
		System.out.println(o.splitOdd10(nums2));
		System.out.println(o.splitOdd10(nums3));

	}

}
