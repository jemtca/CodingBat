
public class array1 {
	
	// given an int array length 2, return true if it contains a 2 or a 3
	public boolean has23(int[] nums) {
		
		boolean b = false;
		
		if (nums.length == 2)
			if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
				b = true;
		
		return b;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {2, 5};
		int[] y = {4, 3};
		int[] z = {4, 5};
		
		System.out.println(o.has23(x));
		System.out.println(o.has23(y));
		System.out.println(o.has23(z));
		
	}

}
