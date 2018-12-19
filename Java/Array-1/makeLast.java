
public class array1 {
	
	// given an int array, return a new array with double the length where its last element is the same as the original array, and all the other elements are 0
	// the original array will be length 1 or more
	public int[] makeLast(int[] nums) {
		
		int[] i = new int[nums.length*2];
		
		if (nums.length > 0)
			i[i.length-1] = nums[nums.length-1];
		
		return i;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {4, 5, 6};
		int[] y = {1, 2};
		int[] z = {3};
		int[] temp;
		
		temp = o.makeLast(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + 
		temp[3] + ", " + temp[4] + ", " + temp[5] + "]");
		
		temp = o.makeLast(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.makeLast(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
	}

}
