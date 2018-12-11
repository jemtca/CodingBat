
public class array1 {
	
	// given an array of ints length 3, return a new array with the elements in reverse order
	public int[] reverse3(int[] nums) {
		
		int x[] = new int[3];
		
		if (nums.length == 3) {
			x[0] = nums[nums.length-1];
			x[1] = nums[1];
			x[2] = nums[0];
		}
		
		return x;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {5, 11, 9};
		int[] z = {7, 0, 0};
		int[] temp;
		
		temp = o.reverse3(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.reverse3(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.reverse3(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
	}

}
