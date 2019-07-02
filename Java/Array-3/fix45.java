
public class array3 {
	
	// return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5
	// do not move the 4's, but every other number may move
	// the array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4
	// in this version, 5's may appear anywhere in the original array
	public int[] fix45(int[] nums) {
		
		int length = 0;
		int[] indexAfter4;
		int[] index5;
		int count = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4) {
				length++;
			}
		}
		
		indexAfter4 = new int[length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 4 && nums[i + 1] != 5) {
				indexAfter4[count] = i + 1;
				count++;
			}
		}
		
		count = 0;
		index5 = new int[length];
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == 5 && nums[i - 1] != 4) {
				index5[count] = i;
				count++;
			}
		}
		
		for (int i = 0; i < indexAfter4.length; i++) {
			int temp = nums[indexAfter4[i]];
			nums[indexAfter4[i]] = nums[index5[i]];
			nums[index5[i]] = temp;
		}
		
		return nums;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] x = {5, 4, 9, 4, 9, 5};
		int[] y = {1, 4, 1, 5};
		int[] z = {1, 4, 1, 5, 5, 4, 1};
		
		int[] temp;
		
		temp = o.fix45(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] +
							", " + temp[3] + ", " + temp[4] + ", " + temp[5] + "]");
		
		temp = o.fix45(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.fix45(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] +
							", " + temp[4] + ", " + temp[5] + ", " + temp[6] +"]");
		
	}

}
