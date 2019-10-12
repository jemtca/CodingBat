
public class recursion1 {
	
	// given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping
	public int strCount(String str, String sub) {
	
		int count = 0;
		
		if (str.isEmpty()) {
			return count;
		}
		
		if (str.length() >= sub.length() && str.subSequence(0, sub.length()).equals(sub)) {
			count++;
			return count + strCount(str.substring(sub.length()), sub);
		}
		else {
			return count + strCount(str.substring(1), sub);
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.strCount("catcowcat", "cat"));
		System.out.println(o.strCount("catcowcat", "cow"));
		System.out.println(o.strCount("catcowcat", "dog"));
		
	}

}
