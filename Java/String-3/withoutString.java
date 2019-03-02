
public class string3 {

	// given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive)
	// you may assume that the remove string is length 1 or more
	public String withoutString(String base, String remove) {
		
		String s = base;
		
		s = s.replace(remove.toUpperCase(),"");
		s = s.replace(remove.toLowerCase(),"");
		s = s.replace(remove,"");
		
		return s; 
		
	}	
	
	public static void main(String[] args) {
		
		string3 o = new string3();
		
		System.out.println(o.withoutString("Hello there", "llo"));
		System.out.println(o.withoutString("Hello there", "e"));
		System.out.println(o.withoutString("Hello there", "x"));

	}

}
