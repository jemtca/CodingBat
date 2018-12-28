
public class array1 {
	
	// given an int array of any length, return a new array of its first 2 elements
	// if the array is smaller than length 2, use whatever elements are present
	public int[] frontPiece(int[] nums) {

		int[] newArray = new int[2];

		if (nums.length >= 0 && nums.length < 2)
			newArray = nums;
		else {
			newArray[0] = nums[0];
			newArray[1] = nums[1];
		}
		
		return newArray;

	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {1, 2};
		int[] z = {1};
		int[] temp;
		
		temp = o.frontPiece(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.frontPiece(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.frontPiece(z);
		System.out.println("[" + temp[0] + "]");
		
	}

}
