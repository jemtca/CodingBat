
public class warmup2 {

	// this function return the number of times that two 6's are next to each other in the given array
	// also count instances where the second 6 is actually a 7
	public int array667(int[] nums) {
				
		int count = 0;
		
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i] == 6 && (nums[i+1] == 6 || nums[i+1] == 7))
				count++;
		}
		
		return count;

	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		int[] x = {6, 6, 2};
		int[] y = {6, 6, 2, 6};
		int[] z = {6, 7, 2, 6};
		
		System.out.println(o.array667(x));
		System.out.println(o.array667(y));
		System.out.println(o.array667(z));

	}

}
