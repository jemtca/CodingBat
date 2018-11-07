
public class warmup2 {

	// this function return true if the given array contains 2, 7, 1
	// pattern: a value, followed by the value plus 5, followed by the value minus 1
	// Additionally the 271 counts even if the "1" differs by 2 or less from the correct value
	public boolean has271(int[] nums) {
				
		boolean b = false;
			
		for (int i = 0; i < nums.length - 2; i++) {
			if (nums[i+1] == nums[i]+5 && Math.abs(nums[i+2] - (nums[i]-1)) <= 2)
				b = true;
		}
			
		return b;

	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		int[] x = {1, 2, 7, 1};
		int[] y = {1, 2, 8, 1};
		int[] z = {2, 7, 1};
		
		System.out.println(o.has271(x));
		System.out.println(o.has271(y));
		System.out.println(o.has271(z));

	}

}
