
public class ap1 {
	
	// we'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive)
	// given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array 
	public int[] copyEndy(int[] nums, int count) {
		
		int[] x = new int[count];
		int j = 0;
		
		for (int i = 0; i < nums.length && j < count; i++) {
			if ((nums[i] >= 0 && nums[i] <= 10) || (nums[i] >= 90 && nums[i] <= 100)) {
				x[j] = nums[i];
				j++;
			}
		}
		
		return x;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {9, 11, 90, 22, 6};
		int[] y = {9, 11, 90, 22, 6};
		int[] z = {12, 1, 1, 13, 0, 20};
		
		int[] temp;
		
		temp = o.copyEndy(x, 2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");
		
		temp = o.copyEndy(y, 3);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.copyEndy(z, 2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");

	}

}
