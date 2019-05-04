
public class array2 {

	// we'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it
    // return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger
	public int[] notAlone(int[] nums, int val) {

		for (int i = 0; i < nums.length; i++) {
			if (i != 0 && i != nums.length-1 && nums[i] == val) {
				if (nums[i-1] - nums[i+1] < 0) {
					nums[i] = nums[i+1];
				}
				else if (nums[i-1] - nums[i+1] > 0) {
					nums[i] = nums[i-1];
				}
				else {
					nums[i] = nums[i-1];
				}
			}
		}
		
		return nums;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 3};
		int[] y = {1, 2, 3, 2, 5, 2};
		int[] z = {3, 4};
		
		int[] temp;
		
		temp = o.notAlone(x, 2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + "]");
		
		temp = o.notAlone(y, 2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + ", " + temp[5] + "]");
		
		temp = o.notAlone(z, 4);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");

	}

}
