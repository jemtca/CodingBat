
public class array2 {

	// given an array of ints, return true if every element is a 1 or a 4
	public boolean only14(int[] nums) {
		
		boolean b = true;
		boolean found = false;

		for (int i = 0; i < nums.length && !found; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				b = false;
				found = true;
			}
		}
			
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 4, 1, 4};
		int[] y = {1, 4, 2, 4};
		int[] z = {1, 1};
		
		System.out.println(o.only14(x));
		System.out.println(o.only14(y));
		System.out.println(o.only14(z));

	}

}
