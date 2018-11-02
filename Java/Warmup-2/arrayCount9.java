
public class warmup2 {

	// this function return the number of 9´s in the given array
	public int arrayCount9(int[] nums) {
	
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 9)
				count++;
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();

		int[] x = {1, 2, 9};
		int[] y = {1, 9, 9};
		int[] z = {1, 9, 9, 3, 9};
		
		System.out.println(o.arrayCount9(x));
		System.out.println(o.arrayCount9(y));
		System.out.println(o.arrayCount9(z));

	}

}
