
public class array2 {

	// given start and end numbers, return a new array containing the sequence of integers from start up to but not including end
	// so start=5 and end=10 yields {5, 6, 7, 8, 9}
	public int[] fizzArray3(int start, int end) {

		int[] x = new int[end-start];
		int number = start;

		for (int i = 0; i < end-start; i++) {
			x[i] = number;
			number++;
		}
		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		int[] temp;

		temp = o.fizzArray3(5, 10);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + "]");
		
		temp = o.fizzArray3(11, 18);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + ", " + temp[5] + ", " + temp[6] + "]");
		
		temp = o.fizzArray3(1, 3);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");

	}

}
