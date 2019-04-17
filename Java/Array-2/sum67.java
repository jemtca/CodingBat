
public class array2 {

	// return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7)
	// return 0 for no numbers
	public int sum67(int[] nums) {
		
		int sum = 0;
		boolean found = false;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 6) {
				sum = sum + nums[i];
			}
			else {
				for (int j = i; j < nums.length && !found; j++) {
					if (nums[j] == 7) {
						i = j;
						found = true;
					}
				}
				found = false;
			}
		}
				
		return sum;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 2};
		int[] y = {1, 2, 2, 6, 99, 99, 7};
		int[] z = {1, 1, 6, 7, 2};
		
		System.out.println(o.sum67(x));
		System.out.println(o.sum67(y));
		System.out.println(o.sum67(z));

	}

}
