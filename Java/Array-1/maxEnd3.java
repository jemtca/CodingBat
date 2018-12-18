
public class array1 {
	
	// given an array of ints length 3, figure out which is larger, the first or last element in the array, and set all the other elements to be that value
	// return the changed array
	public int[] maxEnd3(int[] nums) {
		
		int[] i = new int[3];
		
        if (nums.length == 3) {
            if (nums[0] <= nums[nums.length-1]) {
                i[0] = nums[nums.length-1];
                i[1] = nums[nums.length-1];
                i[2] = nums[nums.length-1];
            }
            else {
                i[0] = nums[0];
                i[1] = nums[0];
                i[2] = nums[0];
            }
        }
		
		return i;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {11, 5, 9};
		int[] z = {2, 11, 3};
		int[] temp;
		
		temp = o.maxEnd3(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.maxEnd3(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.maxEnd3(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
	}

}
