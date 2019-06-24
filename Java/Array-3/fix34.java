
public class array3 {
	
	// return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4
	// do not move the 3's, but every other number may move
	// the array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4
	public int[] fix34(int[] nums) {
		
		int three = 0;
		int four = 0;
		int[] after3;
		int[] position4;
		int holder = -1;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				three++;
			}
			else if(nums[i] == 4) {
				four++;
			}
		}
		
		after3 = new int[three];
		position4 = new int [four];
		
		three = 0;
		four = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 3) {
				after3[three] = i + 1;
				three++;
			}
			else if (nums[i] == 4) {
				position4[four] = i;
				four++;
			}
		}
		
		for (int i = 0; i < after3.length; i++) {
			holder = nums[after3[i]];
			nums[after3[i]] = nums[position4[i]];
			nums[position4[i]] = holder;
		}
		
		return nums;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] x = {1, 3, 1, 4};
		int[] y = {1, 3, 1, 4, 4, 3, 1};
		int[] z = {3, 2, 2, 4};
		
		int[] temp;

		temp = o.fix34(x);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.fix34(y);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + ", " + temp[5] + ", " + temp[6] + "]");
		
		temp = o.fix34(z);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
	}

}
