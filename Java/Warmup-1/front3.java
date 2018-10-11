
public class warmup1 {

	// this function return a new string which is three copies of the front
	// front = three first chars
	public String front3(String str) {

		String s = "";
		
		if (str.length() < 3)
			s = str + str + str;
		else
			s = str.substring(0, 3) + str.substring(0, 3) + str.substring(0, 3); 
		
		return s;

	}
	
	public static void main(String[] args) {
		
		warmup1 o = new warmup1();
		
		System.out.println(o.front3("Java"));
		System.out.println(o.front3("Chocolate"));
		System.out.println(o.front3("abc"));

	}
	
}
