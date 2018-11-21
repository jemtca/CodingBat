
public class string1 {
	
	// given a string, if the string begins with "red" or "blue" return that color string
	// otherwise return the empty string
	public String seeColor(String str) {
		
		String s = "";
		
		if (str.startsWith("red")) 
			s = "red";
		if (str.startsWith("blue"))
			s = "blue";
		
		return s;
		
	}

	public static void main(String[] args) {
		
		string1 o = new string1();
		
		System.out.println(o.seeColor("redxx"));
		System.out.println(o.seeColor("xxred"));
		System.out.println(o.seeColor("blueTimes"));
		
	}

}
