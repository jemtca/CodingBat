
public class array2 {

	// given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1
	// n may be 0, in which case just return a length 0 array
	public String[] fizzArray2(int n) {

		String[] s = new String[n];
		
		for (int i = 0; i < n; i++) {
			s[i] = Integer.toString(i);
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {

		array2 o = new array2();
		
		String[] temp;
		
		temp = o.fizzArray2(4);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + "]");
		
		temp = o.fizzArray2(10);
		System.out.println("[" + temp[0] + ", " + temp[1] + ", " + temp[2] + ", " + temp[3] + ", " + temp[4] +
							", " + temp[5] + ", " + temp[6] + ", " + temp[7] + ", " + temp[8] + ", " + temp[9] + "]");
		
		temp = o.fizzArray2(2);
		System.out.println("[" + temp[0] + ", " + temp[1] + "]");

	}

}
