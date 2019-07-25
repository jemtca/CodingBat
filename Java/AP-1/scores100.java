
public class ap1 {
	
	// given an array of scores, return true if there are scores of 100 next to each other in the array
	// the array length will be at least 2
	public boolean scores100(int[] scores) {
		
		boolean b = false;
		
		for (int i = 0; i < scores.length - 1 && !b; i++) {
			if (scores[i] == 100 && scores[i+1] == 100) {
				b = true;
			}
		}
		
		return b;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x = {1, 100, 100};
		int[] y = {1, 100, 99, 100};
		int[] z = {100, 1, 100, 100};
		
		System.out.println(o.scores100(x));
		System.out.println(o.scores100(y));
		System.out.println(o.scores100(z));

	}

}
