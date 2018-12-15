
public class array1 {
	
	// we'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1
	// return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array
	public boolean unlucky1(int[] nums) {
		
		boolean b = false;
		
		if (nums.length > 1) {
			if ((nums[0] == 1 && nums[1] == 3) || (nums[1] == 1 && nums[2] == 3))
				b = true;
			else if (nums[nums.length -2] == 1 && nums[nums.length-1] == 3)
				b = true;
		}
		
		return b;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 3, 4, 5};
		int[] y = {2, 1, 3, 4, 5};
		int[] z = {1, 1, 1};
		
		System.out.println(o.unlucky1(x));
		System.out.println(o.unlucky1(y));
		System.out.println(o.unlucky1(z));
		
	}

}
