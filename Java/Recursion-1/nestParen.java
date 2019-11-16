
public class recursion1 {
	
	// given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))"
	public boolean nestParen(String str) {
	
		if (str.isEmpty()) {
			return true;
		}
		
		if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')') {
			return nestParen(str.substring(1, str.length()-1));
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {

		recursion1 o = new recursion1();
		
		System.out.println(o.nestParen("(())"));
		System.out.println(o.nestParen("((()))"));
		System.out.println(o.nestParen("(((x))"));
		
	}

}
