
public class ap1 {
	
	// given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2
	public boolean scoreClumps(int[] scores) {
		
		boolean b = false;

		for (int i  = 0; i < scores.length - 2 && !b; i++) {
			if ((Math.abs(scores[i] - scores[i+1]) < 3) && (Math.abs(scores[i] - scores[i+2]) < 3) && (Math.abs(scores[i+1] - scores[i+2]) < 3)) {
				b = true;
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {3, 4, 5};
		int[] y = {3, 4, 6};
		int[] z = {1, 3, 5, 5};
		
		System.out.println(o.scoreClumps(x));
		System.out.println(o.scoreClumps(y));
		System.out.println(o.scoreClumps(z));

	}

}
