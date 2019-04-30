
public class array2 {

	// return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25
	public boolean tripleUp(int[] nums) {
		
		boolean b = false;
		boolean found = false;
		
		for (int i = 0; i < nums.length - 2 && !found; i++) {
			if (nums[i+1] == nums[i] + 1 && nums[i+2] == nums[i] + 2) {
				b = true;
				found = true;
			}
		}

			
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 4, 5, 6, 2};
		int[] y = {1, 2, 3};
		int[] z = {1, 2, 4};
		
		System.out.println(o.tripleUp(x));
		System.out.println(o.tripleUp(y));
		System.out.println(o.tripleUp(z));

	}

}
