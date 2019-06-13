
public class array3 {
	
	// given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ...   1, 2, 3  ...  n}
	public int[] seriesUp(int n) {
		
		int[] x = new int[(n*(n+1))/2];
		int times = 1;
		int number = 1;
		int index = 0;

		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < times; j++) {
				x[index] = number;
				number++;
				index++;
				i++;
			}
			number = 1;
			times++;
		}
		
		return x;
		
	}

	public static void main(String[] args) {
	
		array3 o = new array3();
		
		int[] temp;

		temp = o.seriesUp(3);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] +
							", " + temp[3] + ", " + temp[4] + ", " + temp[5] + "]");
		
		temp = o.seriesUp(4);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + 
							", " + temp[5] + ", " + temp[6] + ", " + temp[7] + ", " + temp[8] + ", " + temp[9] + "]");
		
		temp = o.seriesUp(2);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + "]");
		
	}

}
