
public class array2 {

	// return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers
	// other than that, the numbers can be in any order 
	public int[] evenOdd(int[] nums) {

		int x[] = new int[nums.length];
		int index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0) {
				x[index] = nums[i];
				index++;
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				x[index] = nums[i];
				index++;
			}
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 0, 1, 0, 0, 1, 1};
		int[] y = {3, 3, 2};
		int[] z = {2, 2, 2};
		
		int[] temp;

		temp = o.evenOdd(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp [3] + ", " + temp[4] + ", " + temp[5] + ", " + temp[6] +  "]");
		
		temp = o.evenOdd(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.evenOdd(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");

	}

}
