
public class ap1 {
	
	// given an array of scores, compute the int average of the first half and the second half, and return whichever is larger
	// we'll say that the second half begins at index length/2
	// the array length will be at least 2
	public int scoresAverage(int[] scores) {
		
		int x1 = 0;
		int x2 = 0;
		int count = 0;
		int middle = scores.length/2;
		
		for (int i = 0; i < middle; i++) {
			x1 = x1 + scores[i];
			count++;
		}
		
		x1 = x1 / count;
		count = 0;
		
		for (int i = middle; i < scores.length; i++) {
			x2 = x2 + scores[i];
			count++;
		}
		
		x2 = x2 / count;
		
		return x1 > x2 ? x1 : x2;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {2, 2, 4, 4};
		int[] y = {4, 4, 4, 2, 2, 2};
		int[] z = {3, 4, 5, 1, 2, 3};
		
		System.out.println(o.scoresAverage(x));
		System.out.println(o.scoresAverage(y));
		System.out.println(o.scoresAverage(z));

	}

}
