
public class array2 {

	// we'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value
	// return true if the given value is everywhere in the array
	public boolean isEverywhere(int[] nums, int val) {
		
		boolean b = true;
		boolean found = false;

		for (int i = 0; i < nums.length - 1 && !found; i++) {
			if (nums[i] != val && nums[i+1] != val) {
				b = false;
				found = true;
			}
		}
			
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 1, 3};
		int[] y = {1, 2, 1, 3};
		int[] z = {1, 2, 1, 3, 4};
		
		System.out.println(o.isEverywhere(x, 1));
		System.out.println(o.isEverywhere(y, 2));
		System.out.println(o.isEverywhere(z, 1));

	}

}
