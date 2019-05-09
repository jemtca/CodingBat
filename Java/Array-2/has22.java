
public class array2 {

	// given an array of ints, return true if the array contains a 2 next to a 2 somewhere
	public boolean has22(int[] nums) {

		boolean b = false;
		
		for (int i = 0; i < nums.length-1 && !b; i++) {
			if (nums[i] == 2 && nums[i+1] == 2) {
				b = true;
			}
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 2};
		int[] y = {1, 2, 1, 2};
		int[] z = {2, 1, 2};
		
		System.out.println(o.has22(x));
		System.out.println(o.has22(y));
		System.out.println(o.has22(z));

	}

}
