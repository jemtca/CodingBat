
public class array2 {

	// given an array of ints, return true if the sum of all the 2's in the array is exactly 8
	public boolean sum67(int[] nums) {
		
		boolean b = false;
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 2) {
				count++;
			}
		}
		
		if (count == 4) {
			b = true;
		}
			
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {2, 3, 2, 2, 4, 2};
		int[] y = {2, 3, 2, 2, 4, 2, 2};
		int[] z = {1, 2, 3, 4};
		
		System.out.println(o.sum67(x));
		System.out.println(o.sum67(y));
		System.out.println(o.sum67(z));

	}

}
