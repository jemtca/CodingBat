
public class warmup2 {

	// this function return true if the sequence of number 1,2,3 appears somewhere in the given array of int values
	public boolean array123(int[] nums) {
	
		boolean b = false;
		String s = "";
		
		for(int i = 0; i < nums.length; i++) {
			s = s + nums[i];
		}
		
		if (s.contains("123"))
			b = true;
		
		return b;
		
	}
	
	public static void main(String[] args) {
		
		warmup2 o = new warmup2();
		
		int[] x = {1, 1, 2, 3, 1};
		int[] y = {1, 1, 2, 4, 1};
		int[] z = {1, 1, 2, 1, 2, 3};
		
		System.out.println(o.array123(x));
		System.out.println(o.array123(y));
		System.out.println(o.array123(z));

	}

}
