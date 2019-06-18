
public class array3 {
	
	// consider the leftmost and righmost appearances of some value in an array
	// we'll say that the "span" is the number of elements between the two inclusive
	// a single value has a span of 1
	// returns the largest span found in the given array
	public int maxSpan(int[] nums) {
		
		int max = 0;
		int temp = 0;
		
		if (nums.length == 1) {
			max = 1;
		}
		else if (nums.length == 2) {
			if (nums[0] == nums[1]) {
				max = 2;
			}
			else {
				max = 1;
			}
		}
		else if (nums.length > 2) {
			for (int i = 0; i < nums.length; i++) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] == nums[j]) {
						temp = j - i + 1;
						if (max < temp) {
							max = temp;
						}
					}
				}
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] x = {1, 2, 1, 1, 3};
		int[] y = {1, 4, 2, 1, 4, 1, 4};
		int[] z = {1, 4, 2, 1, 4, 4, 4};

		System.out.println(o.maxSpan(x));
		System.out.println(o.maxSpan(y));
		System.out.println(o.maxSpan(z));
		
	}

}
