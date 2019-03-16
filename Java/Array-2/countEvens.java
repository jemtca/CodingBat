
public class array2 {

	// return the number of even ints in the given array
	public int countEvens (int[] nums) {
		
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {2, 1, 2, 3, 4};
		int[] y = {2, 2, 0};
		int[] z = {1, 3, 5};
		
		System.out.println(o.countEvens(x));
		System.out.println(o.countEvens(y));
		System.out.println(o.countEvens(z));

	}

}
