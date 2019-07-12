
public class array3 {
	
	// say that a "clump" in an array is a series of 2 or more adjacent elements of the same value
	// return the number of clumps in the given array
	public int countClumps(int[] nums) {
		
		int countClumps = 0;
		boolean match = false;
		
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i+1] && !match) {
				match = true;
				countClumps++;
			}
			else if (nums[i] != nums[i+1]) {
				match = false;
			}
		}
		
		return countClumps;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] x = {1, 2, 2, 3, 4, 4};
		int[] y = {1, 1, 2, 1, 1};
		int[] z = {1, 1, 1, 1, 1};
		

		System.out.println(o.countClumps(x));
		System.out.println(o.countClumps(y));
		System.out.println(o.countClumps(z));
		
	}

}
