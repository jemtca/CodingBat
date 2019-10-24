
public class recursion1 {
	
	// given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10
	// we'll use the convention of considering only the part of the array that begins at the given index
	// in this way, a recursive call can pass index+1 to move down the array
	// the initial call will pass in index as 0
	public boolean array220(int[] nums, int index) {
		
		if (nums.length < 1 || index == nums.length-1) {
			return false;
		}
		else if (nums[index+1] == nums[index] * 10) {
			return true;
		}
		else {
			return array220(nums, index+1);
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		int[] x = {1, 2, 20};
		int[] y = {3, 30};
		int[] z = {3};
		
		System.out.println(o.array220(x, 0));
		System.out.println(o.array220(y, 0));
		System.out.println(o.array220(z, 0));
		
	}

}
