
public class array1 {
	
	// given an array of ints, return true if 6 appears as either the first or last element in the array
	// the array will be length 1 or more
	public boolean firstLast6(int[] nums) {
		
		boolean b = false;
		
		if (nums.length > 0)
			if (nums[0] == 6 || nums[nums.length-1] == 6)
				b = true;
		
		return b;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1,2,6};
		int[] y = {6,1,2,3};
		int[] z = {13,6,1,2,3};
		
		System.out.println(o.firstLast6(x));
		System.out.println(o.firstLast6(y));
		System.out.println(o.firstLast6(z));
		
	}

}
