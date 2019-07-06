
public class array3 {
	
	// given n>=0, create an array length n*n with the following pattern
	// shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups)
	public int[] squareUp(int n) {
		
		int[] x = new int[n*n];
		int index = x.length - 1;
		int temp = 1;
		int temp2 = n;
		
		for (int i = 0; i < x.length; i++) {
			x[i] = 0;
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = temp2; j > 0; j--) {
				x[index] = temp;
				index--;
				temp++;
			}
			temp = 1;
			temp2--;
			index = index - i;
		}
		
		return x;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] temp;
		
		temp = o.squareUp(3);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] +
							", " + temp[3] + ", " + temp[4] + ", " + temp[5] + 
							", " + temp[6] + ", " + temp[7] + ", " + temp[8] + "]");
		
		temp = o.squareUp(2);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.squareUp(4);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] +
							", " + temp[3] + ", " + temp[4] + ", " + temp[5] +
							", " + temp[6] + ", " + temp[7] + ", " + temp[8] +
							", " + temp[9] + ", " + temp[10] + ", " + temp[11] +
							", " + temp[12] + ", " + temp[13] + ", " + temp[14] +
							", " + temp[15] +"]");
		
	}

}
