
public class array1 {
	
	// given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}
	public int[] rotateLeft3(int[] nums) {
		
		int[] newArray = new int[3];
		
		newArray[0] = nums[1];
		newArray[1] = nums[2];
		newArray[2] = nums[0];
		
		return newArray;
		
	}
	
	public static void main (String[] args) {
		
		array1 o = new array1();
		
		int[] x = {1, 2, 3};
		int[] y = {5, 11, 9};
		int[] z = {7, 0, 0};
		int[] temp;
		
		temp = o.rotateLeft3(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.rotateLeft3(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
		temp = o.rotateLeft3(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
	}

}
