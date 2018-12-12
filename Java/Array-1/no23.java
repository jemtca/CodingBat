
public class array1 {
	
	// given an int array length 2, return true if it does not contain a 2 or 3
	public boolean no23(int[] nums) {
		
		boolean b = true;
		
		if (nums.length == 2)
			if (nums[0] == 2 || nums[0] == 3 || nums[1] == 2 || nums[1] == 3)
				b = false;
		
		return b;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {4, 5};
		int[] y = {4, 2};
		int[] z = {3, 5};
		
		System.out.println(o.no23(x));
		System.out.println(o.no23(y));
		System.out.println(o.no23(z));
		
	}

}
