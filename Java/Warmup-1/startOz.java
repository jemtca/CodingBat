
public class warmup1 {

	// this function return a string made of the two chars (if present),
	// however include first char only if it is 'o' and include the second only if it is 'z'
	public String startOz(String str) {
		
		String s = "";
		
		if (!str.isEmpty()) {
			if (str.length() == 1 && str.charAt(0) == 'o')
				s = "o";
			else {
				if (str.charAt(0) == 'o' && str.charAt(1) != 'z')
					s = "o";
				else if (str.charAt(0) != 'o' && str.charAt(1) == 'z')
					s = "z";
				else if (str.substring(0, 2).compareToIgnoreCase("oz") == 0)
					s = "oz";
			}
		}
		
		return s;
		
	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.startOz("ozymandias"));
		System.out.println(o.startOz("bzoo"));
		System.out.println(o.startOz("oxx"));

	}
	
}

