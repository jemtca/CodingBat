
public class warmup1 {

	// this function return a string where "del" has been deleted from the given string if it appears
	// otherwise, the function return the string unchanged
	public String delDel(String str) {

		String s = str;
		
		if (str.length() >= 4 && str.substring(1, 4).equalsIgnoreCase("del"))
			s = s.substring(0, 1) + s.substring(4);
			
		return s;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.delDel("adelbc"));
		System.out.println(o.delDel("adelHello"));
		System.out.println(o.delDel("adedbc"));

	}
	
}
