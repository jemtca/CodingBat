
public class array1 {
	
	// given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array
	// the array length will be at least 3
	public int[] midThree(int[] nums) {
		
		int[] i = new int[3];
		
		if (nums.length > 2 && nums.length % 2 != 0) {
			i[0] = nums[(nums.length/2)-1];
			i[1] = nums[nums.length/2];
			i[2] = nums[(nums.length/2)+1];
		}
		
		return i;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3, 4, 5};
		int[] y = {8, 6, 7, 5, 3, 0, 9};
		int[] z = {1, 2, 3};
		int[] temp;
		
		temp = o.midThree(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2]+  "]");
		
		temp = o.midThree(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2]+  "]");
		
		temp = o.midThree(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2]+  "]");
		
	}

}
