
public class array2 {

	// given an array length 1 or more of ints, return the difference between the largest and smallest values in the array
	public int bigDiff(int[] nums) {
		
		int largest = nums[0];
		int smallest = nums[0];
		
		for (int i = 0; i < nums.length-1; i++) {
			smallest = Math.min(smallest, nums[i+1]);
		}
		
		for (int i = 0; i < nums.length-1; i++) {
			largest = Math.max(largest, nums[i+1]);
		}
		
		return largest - smallest;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {10, 3, 5, 6};
		int[] y = {7, 2, 10, 9};
		int[] z = {2, 10, 7, 2};
		
		System.out.println(o.bigDiff(x));
		System.out.println(o.bigDiff(y));
		System.out.println(o.bigDiff(z));

	}

}
