
public class array2 {

	// return true if the group of N numbers at the start and end of the array are the same
	// for example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3
	// you may assume that n is in the range 0..nums.length inclusive
	public boolean sameEnds(int[] nums, int len) {
		
		boolean b = true;
		int[] temp1 = new int[len];
		int[] temp2 = new int[len];
		
		for (int i = 0; i < len; i++) {
			temp1[i] = nums[i];
		}
		
		int j = 0;
		for (int i = nums.length - len; i < nums.length; i++) {
			temp2[j] = nums[i];
			j++;
		}
		
		for (int i = 0; i < temp1.length; i++) {
			if (temp1[i] != temp2[i]) {
				b = false;
			}
		}
		
		return b;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {5, 6, 45, 99, 13, 5, 6};
		int[] y = {5, 6, 45, 99, 13, 5, 6};
		int[] z = {5, 6, 45, 99, 13, 5, 6};
		
		System.out.println(o.sameEnds(x, 1));
		System.out.println(o.sameEnds(y, 2));
		System.out.println(o.sameEnds(z, 3));

	}

}
