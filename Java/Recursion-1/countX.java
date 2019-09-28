
public class recursion1 {
	
	// given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string
	public int countX(String str) {
		
		int count = 0;
		
		if (str.isEmpty()) {
			return count;
		}
		
		if (str.toLowerCase().charAt(0) == 'x') {
			count++;
		}
		
		return count + countX(str.substring(1));
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.countX("xxhixx"));
		System.out.println(o.countX("xhixhix"));
		System.out.println(o.countX("hi"));

	}

}
