
public class recursion1 {
	
	// given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length
	public int strDist(String str, String sub) {
		
		if (str.isEmpty() || (str.length() == sub.length() && !str.equals(sub))) {
			return 0;
		}
		
		if (str.length() >= sub.length() && str.substring(0, sub.length()).equals(sub)
			&& str.substring(str.length()-sub.length()).equals(sub)) {
			return str.length();
		}
		
		if (str.substring(0, sub.length()).equals(sub) &&
			!str.substring(str.length()-sub.length()).equals(sub)) {
			return strDist(str.substring(0, str.length()-1), sub);
		}
		else if (!str.substring(0, sub.length()).equals(sub) &&
				str.substring(str.length()-sub.length()).equals(sub)) {
			return strDist(str.substring(1), sub);
		}
		else {
			return strDist(str.substring(1, str.length()-1), sub);
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.strDist("catcowcat", "cat"));
		System.out.println(o.strDist("catcowcat", "cow"));
		System.out.println(o.strDist("cccatcowcatxx", "cat"));
		
	}

}
