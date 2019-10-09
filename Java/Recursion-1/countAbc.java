
public class recursion1 {
	
	// count recursively the total number of "abc" and "aba" substrings that appear in the given string
	public int countAbc(String str) {
	
		int count = 0;
		
		if (str.isEmpty()) {
			return count;
		}
		
		if (str.length() > 2 && (str.substring(0,3).equalsIgnoreCase("abc") || str.substring(0,3).equalsIgnoreCase("aba"))) {
			count++;
			return count + countAbc(str.substring(2));
		}
		else {
			return count + countAbc(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.countAbc("abc"));
		System.out.println(o.countAbc("abcxxabc"));
		System.out.println(o.countAbc("abaxxaba"));

	}

}
