
public class array1 {
	
	// given an array of ints, swap the first and last elements in the array
	// return the modified array
	// the array length will be at least 1
	public int[] swapEnds(int[] nums) {

		int first = nums[0];
		int last = nums[nums.length-1];

		if (nums.length > 0) {
			nums[0] = last;
			nums[nums.length-1] = first;
		}

		return nums;

	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3, 4};
		int[] y = {1, 2, 3};
		int[] z = {8, 6, 7, 9, 5};
		int[] temp;
		
		temp = o.swapEnds(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.swapEnds(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.swapEnds(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " +  temp[4] + "]");
		
	}

}
