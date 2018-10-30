
public class warmup2 {

	// this function return true if the given array does not contain any triples
	// triple = a value appearing 3 times in a row
	public boolean noTriples(int[] nums) {
	
		boolean b = true;
		
		for (int i = 0; i < nums.length - 1; i++)
			if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2])
				b = false;
		
		return b;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		int[] x = {1, 1, 2, 2, 1};
		int[] y = {1, 1, 2, 2, 2, 1};
		int[] z = {1, 1, 1, 2, 2, 2, 1};
		
		System.out.println(o.noTriples(x));
		System.out.println(o.noTriples(y));
		System.out.println(o.noTriples(z));

	}

}
