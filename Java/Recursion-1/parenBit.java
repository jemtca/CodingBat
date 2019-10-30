
public class recursion1 {
	
	// given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)"
	public String parenBit(String str) {
		
		if (str.charAt(0) == ')') {
			return "";
		}
		if (str.charAt(0) == '(') {
			int index = str.indexOf(')');
			return str.substring(0, index+1) + parenBit(str.substring(index));
		}
		else {
			return parenBit(str.substring(1));
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.parenBit("xyz(abc)123"));
		System.out.println(o.parenBit("x(hello)"));
		System.out.println(o.parenBit("(xy)1"));
		
	}

}
