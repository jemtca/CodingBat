
public class array2 {

	// return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array
	// if there is no odd value to the right of the zero, leave the zero as a zero
	public int[] zeroMax(int[] nums) {

		int largestOdd;
		
		for (int i = 0; i < nums.length; i++) {
			largestOdd = 0;
			if (nums[i] == 0) {
				for (int j = i+1; j < nums.length; j++) {
					if (nums[j] % 2 != 0 && largestOdd < nums[j]) {
						largestOdd = nums[j];
					}
				}
				nums[i] = largestOdd;
			}
		} 
		
		return nums;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {0, 5, 0, 3};
		int[] y = {0, 4, 0, 3};
		int[] z = {0, 1, 0};
		
		int[] temp;
		
		temp = o.zeroMax(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.zeroMax(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.zeroMax(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + "]");

	}

}
