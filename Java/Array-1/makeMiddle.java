
public class array1 {
	
	// given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array
	// the original array will be length 2 or more
	public int[] makeMiddle(int[] nums) {
		
		int[] i = new int[2];;
		
		if (nums.length > 1 && nums.length % 2 == 0) {
			i[0] = nums[(nums.length/2)-1];
			i[1] = nums[nums.length/2];
		}
		
		return i;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3, 4};
		int[] y = {7, 1, 2, 3, 4, 9};
		int[] z = {1, 2};
		int[] temp;
		
		temp = o.makeMiddle(x);
		System.out.println("[" + temp[0] + ", " + temp[1] +  "]");
		
		temp = o.makeMiddle(y);
		System.out.println("[" + temp[0] + ", " + temp[1] +  "]");
		
		temp = o.makeMiddle(z);
		System.out.println("[" + temp[0] + ", " + temp[1] +  "]");
		
	}

}
