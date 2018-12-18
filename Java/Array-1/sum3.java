
public class array1 {
	
	// given an array of ints length 3, return the sum of all the elements
	public int sum3(int[] nums) {
		
		int sum = 0;
		
		if (nums.length == 3)
			sum = nums[0] + nums[1] + nums[2];
		
		
		return sum;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {5, 11, 2};
		int[] z = {7, 0, 0};
		
		System.out.println(o.sum3(x));
		System.out.println(o.sum3(y));
		System.out.println(o.sum3(z));
		
	}

}
