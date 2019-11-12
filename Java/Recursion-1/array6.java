
public class recursion1 {
	
	// given an array of ints, compute recursively if the array contains a 6
	// we'll use the convention of considering only the part of the array that begins at the given index
	// in this way, a recursive call can pass index+1 to move down the array
	// the initial call will pass in index as 0
	public boolean array6(int[] nums, int index) {
		
		if (index < nums.length && nums[index] == 6) {
			return true;
		}
		else if (index < nums.length && nums[index] != 6) {
			return array6(nums, index+1);
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		int[] x = {1, 6, 4};
		int[] y = {1, 4};
		int[] z = {6};
		
		System.out.println(o.array6(x, 0));
		System.out.println(o.array6(y, 0));
		System.out.println(o.array6(z, 0));
		
	}

}
