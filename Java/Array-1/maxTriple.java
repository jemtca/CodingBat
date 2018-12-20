
public class array1 {
	
	// given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest
	// the array length will be a least 1
	public int maxTriple(int[] nums) {
		
		int max = 0;
		
		if (nums.length > 0) {
			int first = nums[0];
			int middle = nums[(nums.length/2)];
			int last = nums[nums.length-1];
			
			if (first > middle && first > last)
				max = first;
			else if (middle > first && middle > last)
				max = middle;
			else
				max = last;
		}
		
		return max;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {1, 5, 3};
		int[] z = {5, 2, 3};

		System.out.println(o.maxTriple(x));
		System.out.println(o.maxTriple(y));
		System.out.println(o.maxTriple(z));
		
	}

}
