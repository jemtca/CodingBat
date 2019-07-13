
public class ap1 {
	
	// given an array of scores, return true if each score is equal or greater than the one before
	// the array will be length 2 or more
	public boolean scoresIncreasing(int[] scores) {
		
		boolean b = true;
		
		for (int i = 0; i < scores.length - 1 && b; i++) {
			if (scores[i] > scores[i+1]) {
				b = false;
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {1, 3, 4};
		int[] y = {1, 3, 2};
		int[] z = {1, 1, 4};
		
		System.out.println(o.scoresIncreasing(x));
		System.out.println(o.scoresIncreasing(y));
		System.out.println(o.scoresIncreasing(z));

	}

}
