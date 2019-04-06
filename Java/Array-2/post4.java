
public class array2 {

	// given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array
	// the original array will contain at least one 4
	public int[] post4(int[] nums) {
		
		int[] x = new int[0];
		boolean found = false;
		int index = 0;
		
		for (int i = nums.length-1; i >= 0 && !found; i--) {
			if (nums[i] == 4) {
				x = new int[nums.length-1-i];
				for (int j = i+1; j < nums.length; j++) {
					x[index] = nums[j];
					index++;
				}
				found = true;
			}
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {2, 4, 1, 2};
		int[] y = {4, 1, 4, 2};
		int[] z = {4, 4, 1, 2, 3};
		
		int[] temp;
		
		temp = o.post4(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.post4(y);
		System.out.println("[" + temp[0] + "]");
		
		temp = o.post4(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");

	}

}
