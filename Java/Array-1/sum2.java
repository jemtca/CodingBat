
public class array1 {
	
	// given an array of ints, return the sum of the first 2 elements in the array
	// if the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0
	public int sum2(int[] nums) {
		
		int sum = 0;
		
		if (nums.length > 0) {
			if (nums.length == 1)
				sum = nums[0];
			else
				sum = nums[0] + nums[1];
		}
		
		return sum;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {1, 1};
		int[] z = {1, 1, 1, 1};
		
		System.out.println(o.sum2(x));
		System.out.println(o.sum2(y));
		System.out.println(o.sum2(z));
		
	}

}
