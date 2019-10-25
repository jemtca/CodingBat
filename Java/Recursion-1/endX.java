
public class recursion1 {
	
	// given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string
	public String endX(String str) {
		
		if (str.isEmpty()) {
			return "";
		}
		
		if (str.charAt(0) != 'x') {
			return str.charAt(0) + endX(str.substring(1));
		}
		else {
			return endX(str.substring(1)) + "x";
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.endX("xxre"));
		System.out.println(o.endX("xxhixx"));
		System.out.println(o.endX("xhixhix"));
		
	}

}
