
public class array2 {

	// return the sum of the numbers in the array, returning 0 for an empty array
	// except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count
	public int sum13(int[] nums) {
		
		int sum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 13) {
                sum = sum + nums[i];
            }
            else {
                i = i + 1;
            }
        }
		
		return sum;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {1, 2, 2, 1};
		int[] y = {1, 1};
		int[] z = {1, 2, 2, 1, 13};
		
		System.out.println(o.sum13(x));
		System.out.println(o.sum13(y));
		System.out.println(o.sum13(z));

	}

}
