
public class ap1 {
	
	// given two arrays, A and B, of non-negative int scores
	// A "special" score is one which is a multiple of 10, such as 40 or 90
	// return the sum of largest special score in A and the largest special score in B
	public int scoresSpecial(int[] a, int[] b) {
		
		int maxA = 0;
		int maxB = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 0 && a[i] > maxA) {
				maxA = a[i];
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 10 == 0 && b[i] > maxB) {
				maxB = b[i];
			}
		}
		
		System.out.println("maxA: " + maxA + ", maxB: " + maxB);
		
		return maxA + maxB;
		
	}

	public static void main(String[] args) {
		
		ap1 o = new ap1();
		
		int[] x1 = {12, 10, 4};
		int[] x2 = {2, 20, 30};
		int[] y1 = {20, 10, 4};
		int[] y2 = {2, 20, 10};
		int[] z1 = {12, 11, 4};
		int[] z2 = {2, 20, 31};
		
		System.out.println(o.scoresSpecial(x1, x2));
		System.out.println(o.scoresSpecial(y1, y2));
		System.out.println(o.scoresSpecial(z1, z2));

	}

}
