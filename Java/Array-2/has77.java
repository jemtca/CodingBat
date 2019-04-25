
public class array2 {

	// given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}
	public boolean has77(int[] nums) {
		
		boolean b = false;
		
		for (int i = 0; i < nums.length; i++) {
			if ((i < nums.length - 1 && nums[i] == 7 && nums[i+1] == 7) || (i < nums.length - 2 && nums[i] == 7 && nums[i+2] == 7)) {
				b = true;
			}
		}
			
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 7, 7};
		int[] y = {1, 7, 1, 7};
		int[] z = {1, 7, 1, 1, 7};
		
		System.out.println(o.has77(x));
		System.out.println(o.has77(y));
		System.out.println(o.has77(z));

	}

}
