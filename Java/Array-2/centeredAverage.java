
public class array2 {

	// return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array
	// if there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value
	// use int division to produce the final average
	// you may assume that the array is length 3 or more
	public int centeredAverage(int[] nums) {

		int x = 0;
		int min = nums[0];
		int max = nums[0];
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			else if (nums[i] < min) {
				min = nums[i];
			}
			x = x + nums[i];
		}
		
		x = (x - min - max) / (nums.length - 2);
		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 3, 4, 100};
		int[] y = {1, 1, 5, 5, 10, 8, 7};
		int[] z = {-10, -4, -2, -4, -2, 0};
		
		System.out.println(o.centeredAverage(x));
		System.out.println(o.centeredAverage(y));
		System.out.println(o.centeredAverage(z));

	}

}
