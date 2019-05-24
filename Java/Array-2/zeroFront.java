
public class array2 {

	// return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array
	// the order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}
	public int[] zeroStart(int[] nums) {

		int x[] = new int[nums.length];
		int zeros = 0;
		int number = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				x[zeros] = 0;
				zeros++;
			}
			else {
				number = nums[i];
			}
		}
		
		for (int j = index; j < nums.length; j++) {
			x[j] = number;
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 0, 0, 1};
		int[] y = {0, 1, 1, 0, 1};
		int[] z = {1, 0};
		
		int[] temp;

		temp = o.zeroStart(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp [3] + "]");
		
		temp = o.zeroStart(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp [3] + ", " + temp[4] + "]");
		
		temp = o.zeroStart(z);
		System.out.println("[" + temp[0] + "]");

	}

}
