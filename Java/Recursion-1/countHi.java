
public class recursion1 {
	
	// given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string
	public int countHi(String str) {
		
		if (str.isEmpty()) {
			return 0;
		}
		
		if (str.length() > 1 && str.substring(0, 2).compareToIgnoreCase("hi") == 0) {
			return 1 + countHi(str.substring(2));
		}
		else {
			return countHi(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.countHi("xxhixx"));
		System.out.println(o.countHi("xhixhix"));
		System.out.println(o.countHi("hi"));
		
	}

}
