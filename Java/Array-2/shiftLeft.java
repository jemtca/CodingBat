
public class array2 {

	// return an array that is "left shifted" by one, so {6, 2, 5, 3} returns {2, 5, 3, 6}
	// you may modify and return the given array, or return a new array
	public int[] shiftLeft(int[] nums) {
		
		int[] x = new int[nums.length];
		
		if (nums.length > 0) {
			for (int i = 0; i < nums.length - 1; i++) {
				x[i] = nums[i+1];
			}
			x[nums.length-1] = nums[0];
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {6, 2, 5, 3};
		int[] y = {1, 2};
		int[] z = {1};
		
		int[] temp;
		
		temp = o.shiftLeft(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.shiftLeft(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.shiftLeft(z);
		System.out.println("[" + temp[0] + "]");

	}

}
