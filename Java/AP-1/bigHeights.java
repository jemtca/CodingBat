
public class ap1 {
	
	// we have an array of heights, representing the altitude along a walking trail
	// given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index
	// we'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end
	public int bigHeights(int[] heights, int start, int end) {
		
		int max = 0;

		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i+1]) >= 5) {
				max++;
			}
		}
		
		return max;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {5, 3, 6, 7, 2};
		
		System.out.println(o.bigHeights(x, 2, 4));
		System.out.println(o.bigHeights(x, 0, 1));
		System.out.println(o.bigHeights(x, 0, 4));

	}

}
