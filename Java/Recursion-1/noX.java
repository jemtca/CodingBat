
public class recursion1 {
	
	// given a string, compute recursively a new string where all the 'x' chars have been removed
	public String noX(String str) {
		
		if (str.isEmpty()) {
			return "";
		}
		
		if (str.charAt(0) != 'x') {
			return str.charAt(0) + noX(str.substring(1));
		}
		else {
			return noX(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.noX("xxhixx"));
		System.out.println(o.noX("xhixhix"));
		System.out.println(o.noX("hi"));
		
	}

}
