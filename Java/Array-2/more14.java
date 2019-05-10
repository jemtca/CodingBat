
public class array2 {

	// given an array of ints, return true if the number of 1's is greater than the number of 4's
	public boolean more14(int[] nums) {

		boolean b = false;
		int n1 = 0;
		int n4 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				n1++;
			}
			else if (nums[i] == 4) {
				n4++;
			}
		}
		
		if (n1 > n4) {
			b = true;
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 4, 1};
		int[] y = {1, 4, 1, 4};
		int[] z = {1, 1};
		
		System.out.println(o.more14(x));
		System.out.println(o.more14(y));
		System.out.println(o.more14(z));

	}

}
