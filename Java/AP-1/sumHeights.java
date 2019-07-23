
public class ap1 {
	
	// we have an array of heights, representing the altitude along a walking trail
	// given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index
	// for example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6
	// the start end end index will both be valid indexes into the array with start <= end
	public int sumHeights(int[] heights, int start, int end) {
		
		int sum = 0;
		
		for (int i = start; i < end; i++) {
			if (heights[i] < heights[i+1]) {
				sum = sum + (heights[i+1]-heights[i]);
			}
			else if (heights[i] > heights[i+1]) {
				sum = sum + (heights[i]-heights[i+1]);
			}
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {5, 3, 6, 7, 2};
		int[] y = {5, 3, 6, 7, 2};
		int[] z = {5, 3, 6, 7, 2};

		
		System.out.println(o.sumHeights(x, 2, 4));
		System.out.println(o.sumHeights(y, 0, 1));
		System.out.println(o.sumHeights(z, 0, 4));

	}

}
