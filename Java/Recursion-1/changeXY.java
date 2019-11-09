
public class recursion1 {
	
	// given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars
	public String changeXY(String str) {
		
		if (str.isEmpty()) {
			return "";
		}

		if (str.charAt(0) != 'x') {
			return str.charAt(0) + changeXY(str.substring(1));
		}
		else {
			return 'y' + changeXY(str.substring(1));
		} 
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.changeXY("codex"));
		System.out.println(o.changeXY("xxhixx"));
		System.out.println(o.changeXY("xhixhix"));
		
	}

}
