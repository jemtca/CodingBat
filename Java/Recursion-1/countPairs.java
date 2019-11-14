
public class recursion1 {
	
	// we'll say that a "pair" in a string is two instances of a char separated by a char
	// so "AxA" the A's make a pair
	// pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x
	// recursively compute the number of pairs in the given string
	public int countPairs(String str) {
		
		if (str.length() < 3) {
			return 0;
		}
		
		if (str.charAt(0) == str.charAt(2)) {
			return 1 + countPairs(str.substring(1));
		}
		else {
			return countPairs(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.countPairs("axa"));
		System.out.println(o.countPairs("axax"));
		System.out.println(o.countPairs("axbx"));
		
	}

}
