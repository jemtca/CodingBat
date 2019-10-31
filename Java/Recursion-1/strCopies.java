
public class recursion1 {
	
	// given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping
	// n will be non-negative
	public boolean strCopies(String str, String sub, int n) {
		
		if (n == 0) {
			return true;
		}
		
		if (str.length() >= sub.length() && str.substring(0, sub.length()).equals(sub)) {
			return strCopies(str.substring(1), sub, n-1);
		}
		else if (str.length() >= sub.length()){
			return strCopies(str.substring(1), sub, n);
		}
		
		return false;
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.strCopies("catcowcat", "cat", 2));
		System.out.println(o.strCopies("catcowcat", "cow", 2));
		System.out.println(o.strCopies("catcowcat", "cow", 1));
		
	}

}
