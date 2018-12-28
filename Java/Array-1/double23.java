
public class array1 {
	
	// given an int array, return true if the array contains 2 twice, or 3 twice
    // the array will be length 0, 1, or 2
	public boolean has23(int[] nums) {
		
		boolean b = false;
		
		if (nums.length == 2)
			if (nums[0] == nums[1])
				if (nums[0] == 2 || nums[0] == 3)
					b = true;
		
		return b;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {2, 2};
		int[] y = {3, 3};
		int[] z = {2, 3};
		
		System.out.println(o.has23(x));
		System.out.println(o.has23(y));
		System.out.println(o.has23(z));
		
	}

}
