
public class recursion2 {
	
	// given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target,
	// with this additional constraint: if there are numbers in the array that are adjacent and the identical value,
	// they must either all be chosen, or none of them chosen
	// for example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group
	// (one loop can be used to find the extent of the identical values)
	public boolean groupSumClump(int start, int[] nums, int target) {
	
        if (start >= nums.length) {
			return target == 0;
		}
		else {
			int end = start;
			
			while(end < nums.length && nums[end] == nums[start]) {
				end++;
			}
			
			int length = end - start;			
			
            // use item at end (new start) or not
			return groupSumClump(end, nums, target - nums[start] * length) || groupSumClump(end, nums, target);
		}
		
	}
	
	public static void main(String[] args) {
		
		recursion2 o = new recursion2();
		
		int[] nums1 = {2, 4, 8};
		int[] nums2 = {1, 2, 4, 8, 1};
		int[] nums3 = {2, 4, 4, 8};
		
		System.out.println(o.groupSumClump(0, nums1, 10));
		System.out.println(o.groupSumClump(0, nums2, 14));
		System.out.println(o.groupSumClump(0, nums3, 14));

	}

}
