
public class array3 {
	
	// given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side
	public boolean canBalance(int[] nums) {
		
		boolean b = false;
		boolean found = false;
		int firstSide = 0;
		int secondSide = 0;
		
		for (int i = 0; i < nums.length && !found; i++) {
			firstSide = firstSide + nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				secondSide = secondSide + nums[j];
			}
			if (firstSide == secondSide) {
				found = true;
				b = true;
			}
			secondSide = 0;
		}
		
		
		return b;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] x = {1, 1, 1, 2, 1};
		int[] y = {2, 1, 1, 2, 1};
		int[] z = {10, 10};

		System.out.println(o.canBalance(x));
		System.out.println(o.canBalance(y));
		System.out.println(o.canBalance(z));
		
	}

}
