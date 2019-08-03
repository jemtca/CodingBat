
public class ap1 {
	
	// we have an array of heights, representing the altitude along a walking trail
	// given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double
	public int sumHeights2(int[] heights, int start, int end) {
		
		int x = 0;

		for (int i = start; i < end; i++ ) {
			if (heights[i] > heights[i + 1]) {
				x = x + (heights[i] - heights[i + 1]);
			}
			else {
				x = x + ((heights[i + 1] - heights[i]) * 2);
			}
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {5, 3, 6, 7, 2};
		int[] y = {5, 3, 6, 7, 2};
		int[] z = {5, 3, 6, 7, 2};
		
		System.out.println(o.sumHeights2(x, 2, 4));
		System.out.println(o.sumHeights2(y, 0, 1));
		System.out.println(o.sumHeights2(z, 0, 4));

	}

}
