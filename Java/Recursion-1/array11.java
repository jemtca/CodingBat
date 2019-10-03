
public class recursion1 {
	
	// given an array of ints, compute recursively the number of times that the value 11 appears in the array
	// we'll use the convention of considering only the part of the array that begins at the given index
	// in this way, a recursive call can pass index+1 to move down the array
	// the initial call will pass in index as 0
	public int array11(int[] nums, int index) {
	
		int count = 0;
		
		if (index == nums.length) {
			return count;
		}
		if (nums[index] == 11) {
			count++;
		}
		
		return count + array11(nums, index+1);
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		int[] x = {1, 2, 11};
		int[] y = {11, 11};
		int[] z = {1, 2, 3, 4};
		
		System.out.println(o.array11(x, 0));
		System.out.println(o.array11(y, 0));
		System.out.println(o.array11(z, 0));

	}

}
