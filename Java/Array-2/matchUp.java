
public class array2 {

	// given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index)
	// return the count of the number of times that the two elements differ by 2 or less, but are not equal
	public int matchUp(int[] nums1, int[] nums2) {
		
		int count = 0;

		for (int i = 0; i < nums1.length; i++) {
			if ((Math.abs(nums1[i] - nums2[i])  <= 2) && (nums1[i] != nums2[i])) {
				count++;
			}
		}
		
		return count;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x1 = {1, 2, 3};
		int[] x2 = {2, 3, 10};
		int[] y1 = {1, 2, 3};
		int[] y2 = {2, 3, 5};
		int[] z1 = {1, 2, 3};
		int[] z2 = {2, 3, 3};
		
		System.out.println(o.matchUp(x1, x2));
		System.out.println(o.matchUp(y1, y2));
		System.out.println(o.matchUp(z1, z2));

	}

}
