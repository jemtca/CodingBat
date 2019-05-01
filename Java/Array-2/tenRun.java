
public class array2 {

	// for each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10
	// so {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}
	public int[] tenRun(int[] nums) {
		
		int[] x = new int[nums.length];
		boolean found = false;
		boolean notFirst = false;
		int value = 0;

		for (int i = 0; i < nums.length; i++) {
			if (notFirst) {
				x[i] = value;
			}
			else if (nums[i] % 10 != 0) {
				x[i] = nums[i];
			}
			else {
				notFirst = true;
				value = nums[i];
				x[i] = value;
				for (int j = i+1; j < nums.length && !found; j++) {
					if (nums[j] % 10 != 0) {
						x[j] = value;
					}
					else {
						x[j] = nums[j];
						value = nums[j];
						found = true;
					}
					i++;
				}
			}
		}
			
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] x = {2, 10, 3, 4, 20, 5};
		int[] y = {10, 1, 20, 2};
		int[] z = {10, 1, 9, 20};
		
		int[] temp;
		
		temp = o.tenRun(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + ", " + temp[5] + "]");
		
		temp = o.tenRun(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.tenRun(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + "" + ", " + temp[2] + ", " + temp[3] + "]");

	}

}
