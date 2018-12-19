
public class array1 {
	
	// given an array of ints, return a new array length 2 containing the first and last elements from the original array
	// the original array will be length 1 or more
	public int[] makeEnds(int[] nums) {
		
		int[] i = new int[2];
		
		if (nums.length > 0) {
			i[0] = nums[0];
			i[1] = nums[nums.length-1];
		}
		
		return i;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {1, 2, 3, 4};
		int[] z = {7, 4, 6, 2};
		int[] temp;
		
		temp = o.makeEnds(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.makeEnds(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.makeEnds(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
	}

}
