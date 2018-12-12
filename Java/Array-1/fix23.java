
public class array1 {
	
	// given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0
	// return the changed array
	public int[] fix23(int[] nums) {
		
		if (nums.length == 3)
			if (nums[0] == 2 && nums[1] == 3)
				nums[1] = 0;
			else if(nums[1] == 2 && nums[2] == 3)
				nums[2] = 0;
		
		return nums;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {2, 3, 5};
		int[] z = {1, 2, 1};
		int[] temp;
		
		temp = o.fix23(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.fix23(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.fix23(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
	}

}
