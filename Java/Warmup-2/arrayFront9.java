
public class warmup2 {

	// this function return true if one of the first four elements in the given array is a 9
	public boolean arrayFront9(int[] nums) {
				
		boolean b = false;
		
		for (int i = 0; i < nums.length && !b; i++) {
			if (i < 4 && nums[i] == 9)
				b = true;
			else if (i == 4)
				break;
				
		}
		
		return b;

	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		int[] x = {1, 2, 9, 3, 4};
		int[] y = {1, 2, 3, 4, 9};
		int[] z = {1, 2, 3, 4, 5};
		
		System.out.println(o.arrayFront9(x));
		System.out.println(o.arrayFront9(y));
		System.out.println(o.arrayFront9(z));

	}

}
