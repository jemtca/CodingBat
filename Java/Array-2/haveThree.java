
public class array2 {

	// given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other
	public boolean haveThree(int[] nums) {
		
		boolean b = true;
		boolean found = false;
		int count = 0;
		
		for (int i = 0; i < nums.length && !found; i++) {
			if (i < nums.length - 1 && nums[i] == 3 && nums[i+1] == 3) {
				found = true;
			}
			else if (nums[i] == 3) {
				count++;
			}
		}
		
		if (count != 3) {
			b = false;
		}
			
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {3, 1, 3, 1, 3};
		int[] y = {3, 1, 3, 3};
		int[] z = {3, 4, 3, 3, 4};
		
		System.out.println(o.haveThree(x));
		System.out.println(o.haveThree(y));
		System.out.println(o.haveThree(z));

	}

}
