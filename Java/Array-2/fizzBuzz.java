
public class array2 {

	// Consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4
	// return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number,
	// for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz"
	public String[] fizzBuzz(int start, int end) {
		
		String[] x = new String[end-start];
		int index = 0;
		
		for (int i = start; i < end; i ++) {
			if (i % 3 == 0 && i % 5 == 0) {
				x[index] = "FizzBuzz";
			}
			else if (i % 3 == 0) {
				x[index] = "Fizz";
			}
			else if (i % 5 == 0) {
				x[index] = "Buzz";
			}
			else {
				x[index] = Integer.toString(i);
			}
			index++;
		}

		
		return x;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		String[] temp;
		
		temp = o.fizzBuzz(1, 6);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + "]");
		
		temp = o.fizzBuzz(1, 8);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4]
							+ ", " + temp[5] + ", " + temp[6] + "]");
		
		temp = o.fizzBuzz(1, 11);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] + ", " + temp[5]
							+ ", " + temp[6] + ", " + temp[7] + ", " + temp[8] + ", " + temp[9] + "]");

	}

}
