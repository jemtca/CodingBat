
public class array1 {
	
	// given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal
	public boolean sameFirstLast(int[] nums) {
		
		boolean b = false;
		
		if (nums.length > 0 && nums[0] == nums[nums.length-1]) {
			b = true;
		}
		
		return b;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {1, 2, 3, 1};
		int[] z = {1, 2, 1};
		
		System.out.println(o.sameFirstStart(x));
		System.out.println(o.sameFirstStart(y));
		System.out.println(o.sameFirstStart(z));
		
	}

}
