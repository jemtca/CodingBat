
public class array2 {

	// return a version of the given array where all the 10's have been removed
	// the remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0
	// so {1, 10, 10, 2} yields {1, 2, 0, 0}
	public int[] withoutTen(int[] nums) {
		
		int[] x = new int[nums.length];
		int index = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 10) {
				x[index] = nums[i];
				index++;
			}
		}
		
		for (int i = index; i < nums.length; i++) {
			x[i] = 0;
		}

		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 10, 10, 2};
		int[] y = {10, 2, 10};
		int[] z = {1, 99, 10};
		
		int[] temp;
		
		temp = o.withoutTen(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.withoutTen(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.withoutTen(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");

	}

}
